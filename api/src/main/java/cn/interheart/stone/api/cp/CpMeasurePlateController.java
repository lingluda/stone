package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.service.cp.CpMeasurePlateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Map;

/**
 * 量尺-板拆分
 * shikai
 */
@RestController
@RequestMapping("cp/measurePlate")
public class CpMeasurePlateController {
	@Resource
	CpMeasurePlateService cpMeasurePlateService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<MeasurePlate> dto){
		return new ResponseEntity<>(cpMeasurePlateService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<MeasurePlate> dto){
		return new ResponseEntity<>(cpMeasurePlateService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<MeasurePlate> dto){
		return new ResponseEntity<>(cpMeasurePlateService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<MeasurePlate> dto){
		return new ResponseEntity<>(cpMeasurePlateService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpMeasurePlateService.list(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 公司后台根据项目id获取量尺列表
	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "/getMeasureList", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> getMeasureList(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpMeasurePlateService.getMeasureList(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 公司后台根据项目id获取量尺 报价列表
	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "/getMeasureOfferList", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> getMeasureOfferList(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpMeasurePlateService.getMeasureOfferList(dto.getData()), HttpStatus.OK);
	}

}