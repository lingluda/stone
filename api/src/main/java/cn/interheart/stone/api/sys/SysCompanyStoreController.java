package cn.interheart.stone.api.sys;

import cn.interheart.stone.dao.entity.CompanyStore;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.sys.SysCompanyService;
import cn.interheart.stone.service.sys.SysCompanyStoreService;
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
@RequestMapping("sys/companyStore")
public class SysCompanyStoreController {

	@Resource
	SysCompanyStoreService sysCompanyStoreService;

	/**
	 * 门店详情
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<CompanyStore> dto){
		return new ResponseEntity<>(sysCompanyStoreService.info(dto.getData().getId()), HttpStatus.OK);
	}
}