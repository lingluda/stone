package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.EmployUser;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.cp.CpEmployUserService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 公司APP用户
 * shikai
 */
@RestController
@RequestMapping("cp/employUser")
public class CpEmployUserController {
	@Resource
	CpEmployUserService cpEmployUserService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<EmployUser> dto){

		return new ResponseEntity<>(cpEmployUserService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<EmployUser> dto){
		return new ResponseEntity<>(cpEmployUserService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<EmployUser> dto){
		return new ResponseEntity<>(cpEmployUserService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<EmployUser> dto){
		return new ResponseEntity<>(cpEmployUserService.extInfo(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpEmployUserService.extList(dto.getData()), HttpStatus.OK);
	}


}