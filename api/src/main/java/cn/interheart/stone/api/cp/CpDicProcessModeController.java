package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.DicProcessMode;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.cp.CpDicProcessModeService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 公司加工方式
 * shikai
 */
@RestController
@RequestMapping("cp/dicProcessMode")
public class CpDicProcessModeController {
	@Resource
	CpDicProcessModeService cpDicProcessModeService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<JSONObject> dto){
		JSONObject jsonObject = dto.getData();
		Integer imageId = jsonObject.getInteger("imageId");
		DicProcessMode dicProcessMode =  JSONObject.parseObject(jsonObject.toJSONString(),DicProcessMode.class);
		return new ResponseEntity<>(cpDicProcessModeService.insert(dicProcessMode, imageId), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<DicProcessMode> dto){
		return new ResponseEntity<>(cpDicProcessModeService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<DicProcessMode> dto){
		return new ResponseEntity<>(cpDicProcessModeService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<DicProcessMode> dto){
		return new ResponseEntity<>(cpDicProcessModeService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpDicProcessModeService.list(dto.getData()), HttpStatus.OK);
	}
}