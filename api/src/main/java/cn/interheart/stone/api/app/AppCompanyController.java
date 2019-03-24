package cn.interheart.stone.api.app;

import cn.interheart.stone.api.sys.SysCompanyController;
import cn.interheart.stone.dao.entity.Company;
import cn.interheart.stone.dao.entity.EmployInfo;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.app.AppCompanyService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 公司管理
 * shikai
 */
@RestController
@RequestMapping("/app/company")
public class AppCompanyController {

	@Resource
	AppCompanyService appCompanyService;


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		
		return  new ResponseEntity<>(appCompanyService.list(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 保存草稿
	 * @return
	 */
	@RequestMapping(value = "/saveDraft" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> saveDraft(@RequestBody RequestDto<JSONObject> dto){
		JSONObject jsonObject = dto.getData();

		Company company = JSON.parseObject(jsonObject.toJSONString(), Company.class);
		JSONArray picArray = jsonObject.getJSONArray("images");
		return new ResponseEntity<>(appCompanyService.saveDraft(company, picArray), HttpStatus.OK);
	}

	/**
	 * 修改草稿
	 * @return
	 */
	@RequestMapping(value = "/editDraft" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> editDraft(@RequestBody RequestDto<JSONObject> dto){

		JSONObject jsonObject = dto.getData();
		Company company = JSON.parseObject(jsonObject.toJSONString(), Company.class);
		JSONArray picArray = jsonObject.getJSONArray("images");

		return new ResponseEntity<>(appCompanyService.editDraft(company, picArray), HttpStatus.OK);
	}

	/**
	 *提交审核
	 * @return
	 */
	@RequestMapping(value = "/sendAudit" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> sendAudit(@RequestBody RequestDto<JSONObject> dto){
		JSONObject jsonObject = dto.getData();

		Company company = JSON.parseObject(jsonObject.toJSONString(), Company.class);
		JSONArray picArray = jsonObject.getJSONArray("images");
		return new ResponseEntity<>(appCompanyService.sendAudit(company, picArray), HttpStatus.OK);
	}

	/**
	 * 更新审核
	 * @return
	 */
	@RequestMapping(value = "/editAudit" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> editAudit(@RequestBody RequestDto<JSONObject> dto){
		JSONObject jsonObject = dto.getData();

		Company company = JSON.parseObject(jsonObject.toJSONString(), Company.class);
		JSONArray picArray = jsonObject.getJSONArray("images");
		return new ResponseEntity<>(appCompanyService.editAudit(company, picArray), HttpStatus.OK);
	}

	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<Company> dto){
		return new ResponseEntity<>(appCompanyService.info(dto.getData().getId()), HttpStatus.OK);
	}
}