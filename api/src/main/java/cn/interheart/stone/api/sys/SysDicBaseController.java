package cn.interheart.stone.api.sys;

import cn.interheart.stone.dao.entity.DicBase;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.sys.SysDicBaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 基础数据字典表
 * shikai
 */
@RestController
@RequestMapping("sys/dicBase")
public class SysDicBaseController {
	@Resource
	SysDicBaseService  sysDicBaseService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<DicBase> dto){
		return new ResponseEntity<>(sysDicBaseService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<DicBase> dto){
		return new ResponseEntity<>(sysDicBaseService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<DicBase> dto){
		return new ResponseEntity<>(sysDicBaseService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<DicBase> dto){
		return new ResponseEntity<>(sysDicBaseService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(sysDicBaseService.list(dto.getData()), HttpStatus.OK);
	}
}