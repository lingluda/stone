package cn.interheart.stone.api.app;

import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.dao.entity.extmapper.app.AppProjectExtMapper;
import cn.interheart.stone.service.app.AppProjectService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * APP 项目管理
 * shikai
 */
@RestController
@RequestMapping("/app/project")
public class AppProjectController {

    @Resource
    AppProjectService appProjectService;

    /**
     * 新增 客户项目
     *
     * @return
     */
    @RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<JSONObject> dto){

        JSONObject projectStr = dto.getData().getJSONObject("project");
        JSONArray projectProductListStr = dto.getData().getJSONArray(("projectProductList"));

        Project project = JSON.parseObject(projectStr.toJSONString(), Project.class);
        List<Integer> productList =JSON.parseArray(projectProductListStr.toJSONString(), Integer.class);
        return new ResponseEntity<>(appProjectService.insert(project, productList), HttpStatus.OK);
    }

    /**
     * 编辑 客户项目
     * @return
     */
    @RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> update(@RequestBody RequestDto<JSONObject> dto){

        JSONObject projectStr = dto.getData().getJSONObject("project");
        JSONArray projectProductListStr = dto.getData().getJSONArray(("projectProductList"));

        Project project = JSONObject.parseObject(projectStr.toJSONString(), Project.class);
        List<Integer> productList = JSONArray.parseObject(projectProductListStr.toJSONString(), ArrayList.class);
        return new ResponseEntity<>(appProjectService.update(project, productList), HttpStatus.OK);
    }


    /**
     * 项目详情
     * @return
     */
    @RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> info(@RequestBody RequestDto<Project> dto){
        return new ResponseEntity<>(appProjectService.info(dto.getData().getId()), HttpStatus.OK);
    }

    /**
     * 量尺项目列表
     * @return
     */
    @RequestMapping(value = "/measureProjectList" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> measureProjectList(@RequestBody RequestDto<Map<String, String>> dto){
        return new ResponseEntity<>(appProjectService.measureProjectList(dto.getData()), HttpStatus.OK);
    }
    /**
    * @description 量尺列表项目基本信息及量尺项目的块数统计
    * @author SHI_KAI
    * @date 2018/4/24 14:28
    * @param [dto]
    * @return org.springframework.http.ResponseEntity<cn.interheart.stone.dao.entity.ResultDto>
    */
    @RequestMapping(value = "/projectMeasureInfo" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> projectMeasureInfo(@RequestBody RequestDto<Map<String, Integer>> dto){

        return new ResponseEntity<>(appProjectService.projectMeasureInfo(dto.getData().get("projectId")), HttpStatus.OK);
    }

    /**
    * @description 项目转入报价
    * @author SHI_KAI
    * @date 2018/4/26 10:13
    * @param [dto]
    * @return org.springframework.http.ResponseEntity<cn.interheart.stone.dao.entity.ResultDto>
    */
    @RequestMapping(value = "/projectGoOffer" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> projectGoOffer(@RequestBody RequestDto<Map<String, Integer>> dto){
        return new ResponseEntity<>(appProjectService.projectGoOffer(dto.getData().get("projectId")), HttpStatus.OK);
    }
}