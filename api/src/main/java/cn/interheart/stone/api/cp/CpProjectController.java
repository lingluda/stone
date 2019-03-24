package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.Project;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.cp.CpProjectService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 公司项目
 * shikai
 */
@RestController
@RequestMapping("cp/project")
public class CpProjectController {
	@Resource
	CpProjectService cpProjectService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<Project> dto){

		return new ResponseEntity<>(cpProjectService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<Project> dto){
		return new ResponseEntity<>(cpProjectService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<JSONObject> dto){
		JSONObject projectStr = dto.getData().getJSONObject("project");
		JSONArray projectProductListStr = dto.getData().getJSONArray(("projectProductList"));

		Project project = JSONObject.parseObject(projectStr.toJSONString(), Project.class);
		List<Integer> productList = JSONArray.parseObject(projectProductListStr.toJSONString(), ArrayList.class);
		return new ResponseEntity<>(cpProjectService.update(project, productList), HttpStatus.OK);

	}
	/**
	 * 跟进,客户信息
	 * @return
	 */
	@RequestMapping(value = "/customerInfo" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  customerInfo(@RequestBody RequestDto<Project> dto){
		return new ResponseEntity<>(cpProjectService.customerInfo(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpProjectService.list(dto.getData()), HttpStatus.OK);
	}
}