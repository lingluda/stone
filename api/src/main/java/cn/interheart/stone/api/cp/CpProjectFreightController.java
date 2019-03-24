package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.service.cp.CpProjectFreightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Map;

/**
 * @author SHI_KAI
 * @date 2018/4/26 15:44
 * @description 报价运费管理
 */
@RestController
@RequestMapping("cp/projectFreight")
public class CpProjectFreightController {
	@Resource
	CpProjectFreightService cpProjectFreightService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<ProjectFreight> dto){
		return new ResponseEntity<>(cpProjectFreightService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<ProjectFreight> dto){
		return new ResponseEntity<>(cpProjectFreightService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<ProjectFreight> dto){
		return new ResponseEntity<>(cpProjectFreightService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<ProjectFreight> dto){
		return new ResponseEntity<>(cpProjectFreightService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpProjectFreightService.list(dto.getData()), HttpStatus.OK);
	}
}