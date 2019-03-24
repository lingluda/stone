package cn.interheart.stone.api.app;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.service.app.AppMeasureDoorsillService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author ZHOU_YI_JIE
 * @date 2018/4/24 9:28
 * @description APP量尺门槛石管理
 */
@RestController
@RequestMapping("/app/measureDoorsill")
public class AppMeasureDoorsillController {

    @Resource
    AppMeasureDoorsillService appMeasureDoorsillService;

    /**
     * insert
     * @return
     */
    @RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<MeasureDoorsill> dto){
        return new ResponseEntity<>(appMeasureDoorsillService.insert(dto.getData()), HttpStatus.OK);
    }
    /**
     * info
     * @return
     */
    @RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<MeasureDoorsill> dto){
        return new ResponseEntity<>(appMeasureDoorsillService.info(dto.getData().getId()), HttpStatus.OK);
    }

    /**
     * update
     * @return
     */
    @RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> update(@RequestBody RequestDto<MeasureDoorsill> dto){
        return new ResponseEntity<>(appMeasureDoorsillService.update(dto.getData()), HttpStatus.OK);
    }

    /**
     * list
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
        return  new ResponseEntity<>(appMeasureDoorsillService.list(dto.getData()), HttpStatus.OK);
    }

    /**
     * 查询图片
     * @return
     */
    @RequestMapping(value = "/images", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> images(@RequestBody  RequestDto<MeasureDoorsill> dto){
        return  new ResponseEntity<>(appMeasureDoorsillService.images(dto.getData().getId()), HttpStatus.OK);
    }

    /**
     * 新增/更新方案
     * @return
     */
    @RequestMapping(value = "/updateProgramme" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> updateProgramme(@RequestBody RequestDto<JSONObject> dto){
        JSONObject jsonObject = dto.getData();

        MeasureProgramme measureProgramme = JSON.parseObject(jsonObject.toJSONString(), MeasureProgramme.class);

        Integer imageId = jsonObject.getInteger("imageId");

        return new ResponseEntity<>(appMeasureDoorsillService.updateProgramme(measureProgramme,imageId), HttpStatus.OK);
    }

    /**
     * 方案详情
     * @param dto
     * @return
     */
    @RequestMapping(value = "/extProgrammeInfo" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto>  extProgrammeInfo(@RequestBody RequestDto<MeasureDoorsill> dto){
        return new ResponseEntity<>(appMeasureDoorsillService.extProgrammeInfo(dto.getData().getId()), HttpStatus.OK);
    }
}
