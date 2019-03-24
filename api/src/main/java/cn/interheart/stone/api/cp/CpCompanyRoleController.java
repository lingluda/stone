package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.service.cp.CpCompanyRoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Map;

/**
 * 基础数据字典表
 * shikai
 */
@RestController
@RequestMapping("/cp/companyRole")
public class CpCompanyRoleController {
	@Resource
	CpCompanyRoleService cpCompanyRoleService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<CompanyRole> dto){

		return new ResponseEntity<>(cpCompanyRoleService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<CompanyRole> dto){
		return new ResponseEntity<>(cpCompanyRoleService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<CompanyRole> dto){
		return new ResponseEntity<>(cpCompanyRoleService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<CompanyRole> dto){
		return new ResponseEntity<>(cpCompanyRoleService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpCompanyRoleService.list(dto.getData()), HttpStatus.OK);
	}
}