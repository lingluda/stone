package cn.interheart.stone.api.app;

import cn.interheart.stone.dao.entity.MeasureDoorset;
import cn.interheart.stone.dao.entity.Project;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.app.AppMeasureDoorsetsService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SHI_KAI
 * @date 2018/4/24 9:55
 * @description APP量尺门套管理
 */
@RestController
@RequestMapping("/app/MeasureDoorset")
public class AppMeasureDoorsetController {
    @Resource
    AppMeasureDoorsetsService appMeasureDoorsetsService;

    /**
     * @author SHI_KAI
     * @date 2018/4/24 9:56
     * @description  插入门套量尺
     * @param
     * @return
     */
    @RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<JSONObject> dto){
        JSONObject doorSet = dto.getData();
        JSONArray doorSerImages = doorSet.getJSONArray("images");

        MeasureDoorset measureDoorset = JSON.parseObject(doorSet.toJSONString(), MeasureDoorset.class);
        List<Integer> doorSerImagesList = JSON.parseArray(doorSerImages.toJSONString(), Integer.class);
        return new ResponseEntity<>(appMeasureDoorsetsService.insert(measureDoorset, doorSerImagesList), HttpStatus.OK);
    }

    /***
    * @description 量尺门套列表
    * @author SHI_KAI
    * @date 2018/4/24 16:34
    * @param dto
    * @return ResponseEntity<ResultDto>
    */
    @RequestMapping(value = "/list" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> list(@RequestBody RequestDto<JSONObject> dto){
        JSONObject doorSet = dto.getData();
        JSONArray doorSerImages = doorSet.getJSONArray("images");

        MeasureDoorset measureDoorset = JSON.parseObject(doorSet.toJSONString(), MeasureDoorset.class);
        List<Integer> doorSerImagesList =JSON.parseArray(doorSerImages.toJSONString(), Integer.class);
        return new ResponseEntity<>(appMeasureDoorsetsService.insert(measureDoorset, doorSerImagesList), HttpStatus.OK);
    }
}
