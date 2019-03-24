package cn.interheart.stone.api.sys;

import cn.interheart.stone.dao.entity.Company;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.sys.SysCompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author SHI_KAI
 * @date 2018/4/23 16:06
 * @description 系统后台公司管理
 */
@RestController
@RequestMapping("sys/company")
public class SysCompanyController {
	@Resource
	SysCompanyService sysCompanyService;

	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(sysCompanyService.list(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 公司审核
	 * @return
	 */
	@RequestMapping(value = "/companyAudit" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> companyAudit(@RequestBody  RequestDto<Company> dto){
		return new ResponseEntity<>(sysCompanyService.companyAudit(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 公司禁用
	 * @param
	 * @return
	 */
	@RequestMapping(value = "/companyDisable" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> companyDisable(@RequestBody  RequestDto<Company> dto){
		return new ResponseEntity<>(sysCompanyService.companyDisable(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 公司门店数量统计
	 * @return
	 */
	@RequestMapping(value = "/countCompanyStroe", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> countCompanyStore(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(sysCompanyService.countCompanyStore(dto.getData()),  HttpStatus.OK);
	}


	/**
	 * 公司门店列表
	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "/companyStorelist", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> companyStorelist(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(sysCompanyService.companyStorelist(dto.getData()), HttpStatus.OK);
	}
}