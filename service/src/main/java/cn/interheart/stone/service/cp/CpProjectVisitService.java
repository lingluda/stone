package cn.interheart.stone.service.cp;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.common.utils.StrUtil;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.app.dto.ProjectVisitDto;
import cn.interheart.stone.dao.entity.extmapper.cp.CpProjectVisitExtMapper;
import cn.interheart.stone.dao.entity.mapper.ProjectMapper;
import cn.interheart.stone.dao.entity.mapper.ProjectVisitMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static cn.interheart.stone.common.enums.StoneEnums.ProjectDealStatusEnum.TRANSACTION;

@Service
public class CpProjectVisitService {

    @Resource
    ProjectVisitMapper projectVisitMapper;
    @Resource
    CpProjectVisitExtMapper cpProjectVisitExtMapper;
    @Resource
    ProjectMapper projectMapper;

    /**
     * insert
     * @return AjaxModel
     */
    public ResultDto insert(ProjectVisit projectVisit){
        ResultDto resultDto = new ResultDto();
        projectVisit.setGmtCreate(new Date());
        int res = projectVisitMapper.insertSelective(projectVisit);
        if(res <= 0){
            resultDto.setCode("1");
            resultDto.setMsg("保存失败!");
        }
        return  resultDto;
    }

    /**
     * del
     * @return
     */
    public ResultDto del(Integer id){
        ResultDto resultDto = new ResultDto();
        if(id == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  projectVisitMapper.deleteByPrimaryKey(id);
        if(res <= 0){
            resultDto.setCode("1");
            resultDto.setMsg("删除失败!");
        }
        return resultDto;
    }

    /**
     * update
     * @return
     */
    public ResultDto update(ProjectVisit projectVisit){
        ResultDto resultDto = new ResultDto();
        if(projectVisit.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        int res =  projectVisitMapper.updateByPrimaryKeySelective(projectVisit);
        if(res <= 0){
            resultDto.setCode("1");
            resultDto.setMsg("更新失败!");
        }
        return  resultDto;
    }
    /**
     * info
     * @param id
     * @return
     */
    public ResultDto info(Integer id){
        ResultDto resultDto = new ResultDto();
        if(id == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }
        ProjectVisit projectVisit = projectVisitMapper.selectByPrimaryKey(id);
        resultDto.setData(projectVisit);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        ProjectVisitExample projectVisitExample = new ProjectVisitExample();
        //查询条件
        ProjectVisitExample.Criteria criteria = projectVisitExample.createCriteria();

        //返回结果
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(projectVisitMapper.selectByExample(projectVisitExample));

        resultDto.setData(page);
        return resultDto;
    }

    /**
     * 保存客户回访记录
     * @param projectVisit
     * @return
     */
    public ResultDto saveProjectVisit(ProjectVisit projectVisit,Project project){
        ResultDto resultDto = new ResultDto();
        if(projectVisit!=null){
            if (projectVisit.getCustomerIntention()!=null){
                ProjectVisit dbProjectVisit = null;
                if(projectVisit.getId()==null){
                    //新增
                    if (projectVisit.getProjectId()!=null){
                        changeCustomerIntentionConfig(projectVisit.getCustomerIntention(), projectVisit);
                        int id = projectVisitMapper.insertSelective(projectVisit);
                        dbProjectVisit = projectVisit;
                        resultDto.setData(projectVisit.getId());
                    }else{
                        resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
                        resultDto.setMsg("projectId不能为空");
                    }
                }else{
                    //修改
                    dbProjectVisit = projectVisitMapper.selectByPrimaryKey(projectVisit.getId());
                    if (dbProjectVisit!=null){
                        projectVisit.setGmtModified(new Date());
                        changeCustomerIntentionConfig(projectVisit.getCustomerIntention(), projectVisit);
                        int count = projectVisitMapper.updateByPrimaryKeySelective(projectVisit);
                        if (count==0) {
                            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
                            resultDto.setMsg("更新失败");
                        }
                    }else{
                        resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
                        resultDto.setMsg("更新失败，未找到数据");
                    }
                }

                //修改project
                Project dbProject = projectMapper.selectByPrimaryKey(dbProjectVisit.getProjectId());
                //如果项目状态是 待拜访状态则改变项目状态为拜访
                if (dbProject!=null && dbProject.getStatus()== StoneEnums.ProjectStatusEnum.UNVISIT.getValue().byteValue()){
                    dbProject.setStatus(StoneEnums.ProjectStatusEnum.VISIT.getValue().byteValue());
                }
                //成交用户需要修改量尺人员
                if(projectVisit.getCustomerIntention()== TRANSACTION.getValue().byteValue()
                        && project !=null){
                    dbProject.setLcUserId(project.getLcUserId());
                    dbProject.setStatus(StoneEnums.ProjectStatusEnum.SCALE.getValue());//项目状态设为量尺
                }else{
                    dbProject.setStatus(StoneEnums.ProjectStatusEnum.VISIT.getValue());
                    dbProject.setLcUserId(0);
                }
                //修改客户意向
                dbProject.setCustomerIntention(dbProjectVisit.getCustomerIntention());
                projectMapper.updateByPrimaryKeySelective(dbProject);
            }else{
                resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
                resultDto.setMsg("customerIntention不能为空");
            }

        }else{
            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
            resultDto.setMsg("参数不正确");
        }
        return resultDto;
    }

    /**
     * 根据客户意向状态清除其他项
     * @param customerIntention
     * @param source
     */
    public void changeCustomerIntentionConfig(Byte customerIntention,ProjectVisit source){
        if(customerIntention==StoneEnums.ProjectDealStatusEnum.TRANSACTION.getValue()){
            //成交用户
            source.setCauseOfLoss("");
            source.setNextContext("");
            source.setEstimatedTime(null);
        }else {
            if (customerIntention==StoneEnums.ProjectDealStatusEnum.INTENTIONAL.getValue()
                    || customerIntention==StoneEnums.ProjectDealStatusEnum.POTENTIAL.getValue()){
                //意向客户 和潜在客户
                source.setCauseOfLoss("");
            }else if(customerIntention==StoneEnums.ProjectDealStatusEnum.LOSS.getValue()){
                //流失客户
                source.setNextContext("");
                source.setEstimatedTime(null);
            }
            source.setEarnestMoney(BigDecimal.ZERO);
            source.setPayType("");
            source.setPayAccount("");
            source.setPayDate(null);
            source.setExecDate(null);
        }

    }

    /**
     * 查询客户回访列表
     * @param dto
     * @return
     */
    public ResultDto getProjectVisitList(Map<String,String> dto){
        ResultDto resultDto = new ResultDto();
        if (StrUtil.notNullOrEmpty(dto.get("projectId"))){
            //设置分页
            int pageIndex = NumberUtils.toInt(dto.get("pageIndex"), 1);
            int pageSize = NumberUtils.toInt(dto.get("pageSize"), 10);
            PageHelper.startPage(pageIndex,pageSize, true);
            PageList pageList = new PageList(cpProjectVisitExtMapper.getProjectVisitList(dto));

            Project dbProject = projectMapper.selectByPrimaryKey(Integer.parseInt(dto.get("projectId")));

            JSONObject jsonObject = (JSONObject) JSON.toJSON(pageList);
            jsonObject.put("projectName", dbProject.getProjectName());
            resultDto.setData(jsonObject);
        }else{
            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
            resultDto.setMsg("projectId不能为空");
        }

        return resultDto;
    }

}