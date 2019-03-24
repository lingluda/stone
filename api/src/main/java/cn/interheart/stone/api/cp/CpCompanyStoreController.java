package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.CompanyStore;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.cp.CpCompanyStoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 公司门店
 * shikai
 */
@RestController
@RequestMapping("cp/companyStore")
public class CpCompanyStoreController{
	@Resource
	CpCompanyStoreService cpCompanyStoreService;


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpCompanyStoreService.list(dto.getData()), HttpStatus.OK);
	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<CompanyStore> dto){
		return new ResponseEntity<>(cpCompanyStoreService.info(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * 分店、门店审核
	 * @return
	 */
	@RequestMapping(value = "/companyStoreAudit", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> companyStoreAudit(@RequestBody  RequestDto<CompanyStore> dto){
		return  new ResponseEntity<>(cpCompanyStoreService.companyStoreAudit(dto.getData()), HttpStatus.OK);
	}


}