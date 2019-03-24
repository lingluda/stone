package cn.interheart.stone.service.app;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.common.utils.StrUtil;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.app.AppProjectVisitExtMapper;
import cn.interheart.stone.dao.entity.extmapper.app.dto.ProjectVisitDto;
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
public class AppProjectVisitService {
    @Resource
    ProjectMapper projectMapper;
    @Resource
    ProjectVisitMapper projectVisitMapper;
    @Resource
    AppProjectVisitExtMapper appProjectVisitExtMapper;

    /**
     *客户拜访列表
     * @param dto
     * @return
     */
    public ResultDto getCustomerVisitList(Map<String,String> dto){
        ResultDto resultDto = new ResultDto();

        if(StrUtil.notNullOrEmpty(dto.get("xsUserId"))){
            //设置分页
            int pageIndex = NumberUtils.toInt(dto.get("pageIndex"), 1);
            int pageSize = NumberUtils.toInt(dto.get("pageSize"), 10);
            PageHelper.startPage(pageIndex,pageSize, true);
            PageList pageList = new PageList(appProjectVisitExtMapper.getCustomerVisitList(dto));
            pageList.getRows();
            resultDto.setData(pageList);
        }else{
            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
            resultDto.setMsg("xsUserId不能为空");
        }
        return resultDto;
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
            PageList pageList = new PageList(appProjectVisitExtMapper.getProjectVisitList(dto));

            Project dbProject = projectMapper.selectByPrimaryKey(Integer.parseInt(dto.get("projectId")));

            List<ProjectVisitDto> pvDtoList = new ArrayList<>();
            pageList.getRows().stream().forEach(prjectVist -> {
                ProjectVisit projectVisit = (ProjectVisit) prjectVist;
                ProjectVisitDto projectVisitDto = new ProjectVisitDto();
                BeanUtils.copyProperties(projectVisit,projectVisitDto);
                pvDtoList.add(projectVisitDto);
            });
            pageList.setRows(pvDtoList);
            JSONObject jsonObject = JSON.parseObject(JSONObject.toJSONString(pageList));
            jsonObject.put("projectName", dbProject.getProjectName());
            resultDto.setData(jsonObject);
        }else{
            resultDto.setCode(StoneEnums.AjaxBackStatus.AJAX_FAIL.getValue());
            resultDto.setMsg("projectId不能为空");
        }

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
            ProjectVisit dbProjectVisit = null;
            if(projectVisit.getId()==null){
                //新增
                if (projectVisit.getProjectId()!=null){
                    projectVisit.setContactTime(new Date());//联系时间
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
            resultDto.setMsg("参数不正确");
        }
        return resultDto;
    }


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

//    public static  void main(String[] agrs){
//        Byte i = 1;
//        AppProjectVistService.changeCustomerIntentionConfig(i);
//    }

}
