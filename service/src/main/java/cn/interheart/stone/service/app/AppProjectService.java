package cn.interheart.stone.service.app;

import cn.interheart.stone.common.enums.StoneEnums;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.app.AppProductExtMapper;
import cn.interheart.stone.dao.entity.extmapper.app.AppProjectExtMapper;
import cn.interheart.stone.dao.entity.extmapper.app.dto.ProjectBaseDto;
import cn.interheart.stone.dao.entity.mapper.DicBaseMapper;
import cn.interheart.stone.dao.entity.mapper.ProjectMapper;
import cn.interheart.stone.dao.entity.mapper.ProjectProductMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class AppProjectService {

    @Resource
    ProjectMapper projectMapper;

    @Resource
    ProjectProductMapper projectProductMapper;


    @Resource
    AppProjectExtMapper appProjectExtMapper;

    /**
     * insert
     * @return AjaxModel
     */
    @Transactional(rollbackFor = Exception.class)
    public ResultDto insert(Project project, List<Integer> projectProductList){
        ResultDto resultDto = new ResultDto();
        project.setGmtCreate(new Date());
        project.setStatus(StoneEnums.ProjectStatusEnum.UNVISIT.getValue().byteValue());
        //随机生成单号
        String start = RandomStringUtils.randomAlphabetic(2).toUpperCase();
        String zj = new SimpleDateFormat("MMDDHHmm").format(new Date());
        String end = String.valueOf(RandomUtils.nextInt(60));
        project.setOddNumbers( start + zj + end);

        projectMapper.insertSelective(project);
        for (Integer id : projectProductList) {
            ProjectProduct projectProduct = new ProjectProduct();
            projectProduct.setProjectId(project.getId());
            projectProduct.setProductId(id);
            projectProduct.setGmtCreate(new Date());
            projectProductMapper.insert(projectProduct);
        }
        return  resultDto;
    }



    /**
     * update
     * @return
     */
    public ResultDto update(Project project, List<Integer> projectProductList){
        ResultDto resultDto = new ResultDto();
        if(project.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("参数Id 不能为空!");
            return resultDto;
        }

        projectMapper.updateByPrimaryKeySelective(project);

        ProjectProductExample projectProductExample = new ProjectProductExample();
        projectProductExample.createCriteria().andProjectIdEqualTo(project.getId());
        projectProductMapper.deleteByExample(projectProductExample);
        for (Integer id : projectProductList) {
            ProjectProduct projectProduct = new ProjectProduct();
            projectProduct.setProjectId(project.getId());
            projectProduct.setProductId(id);
            projectProduct.setGmtCreate(new Date());
            projectProductMapper.insert(projectProduct);
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
        Project project = projectMapper.selectByPrimaryKey(id);

        ProjectProductExample projectProductExample = new ProjectProductExample();
        ProjectProductExample.Criteria criteria = projectProductExample.createCriteria();
        criteria.andProjectIdEqualTo(project.getId());
        List<ProjectProduct> projectProducts = projectProductMapper.selectByExample(projectProductExample);

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(project);
        jsonObject.put("projectProducts", projectProducts);
        resultDto.setData(jsonObject);
        return  resultDto;
    }
    /**
     * list
     * @return
     */
    public ResultDto list(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();

        //查询条件
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria = projectExample.createCriteria();


        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(projectMapper.selectByExample(projectExample));
        resultDto.setData(page);

        return resultDto;
    }

    /**
     * 量尺人员的项目列表
     * @return
     */
    public ResultDto measureProjectList(Map<String,String> data) {
        ResultDto resultDto = new ResultDto();
        data.put("scale", StoneEnums.ProjectStatusEnum.SCALE.getValue().toString());
        data.put("offer", StoneEnums.ProjectStatusEnum.OFFER.getValue().toString());
        int pageIndex = NumberUtils.toInt(data.get("pageIndex"), 1);
        int pageSize = NumberUtils.toInt(data.get("pageSize"), 10);
        PageHelper.startPage(pageIndex,pageSize, true);
        PageList page = new PageList(appProjectExtMapper.measureProjectList(data));
        resultDto.setData(page);
        return resultDto;
    }

    /**
    * @description 量尺人员查看项目的基本信息和所有量尺块数统计
    * @author SHI_KAI
    * @date 2018/4/24 14:36
    * @param [projectId]
    * @return cn.interheart.stone.dao.entity.ResultDto
    */
    public ResultDto projectMeasureInfo(Integer projectId){
        ResultDto resultDto = new ResultDto();
        List<ProjectBaseDto> projectBaseDtoList = appProjectExtMapper.projectBaseInfo(projectId);
        List<Map<String, Integer>> countMeasureNumber = appProjectExtMapper.countMeasureNumber(projectId);
        if(!projectBaseDtoList.isEmpty()){
            String resJsonStr = JSON.toJSONString(projectBaseDtoList.get(0));
            JSONObject resJsonObj = JSONObject.parseObject(resJsonStr);
            resJsonObj.put("countMeasureNumber", countMeasureNumber.get(0));
            resultDto.setData(resJsonObj);
        }
        return  resultDto;
    }

    /**
     * @description 项目报价
     * @author SHI_KAI
     * @date 2018/4/26 10:14
     * @param [projectId]
     * @return cn.interheart.stone.dao.entity.ResultDto
     */
    public ResultDto projectGoOffer(Integer projectId) {

        ResultDto resultDto = new ResultDto();
        Project project = projectMapper.selectByPrimaryKey(projectId);
        if (project != null) {
            project.setStatus(StoneEnums.ProjectStatusEnum.OFFER.getValue().byteValue());
            projectMapper.updateByPrimaryKey(project);
        } else {
            resultDto.setCode("1");
            resultDto.setMsg("转入失败!");
        }

        return resultDto;
    }

}