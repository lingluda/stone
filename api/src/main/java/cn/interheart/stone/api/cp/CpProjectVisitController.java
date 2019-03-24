package cn.interheart.stone.api.cp;

import cn.interheart.stone.dao.entity.Project;
import cn.interheart.stone.dao.entity.ProjectVisit;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.cp.CpProjectVisitService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 公司项目--回访记录
 * shikai
 */
@RestController
@RequestMapping("cp/projectVisit")
public class CpProjectVisitController {
	@Resource
	CpProjectVisitService cpProjectVisitService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<ProjectVisit> dto){

		return new ResponseEntity<>(cpProjectVisitService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<ProjectVisit> dto){
		return new ResponseEntity<>(cpProjectVisitService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<ProjectVisit> dto){
		return new ResponseEntity<>(cpProjectVisitService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<ProjectVisit> dto){
		return new ResponseEntity<>(cpProjectVisitService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpProjectVisitService.list(dto.getData()), HttpStatus.OK);
	}

	/**
	 * 新增用户回访
	 * @param dto
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveProjectVisit", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> addProjectVisit(@RequestBody RequestDto<JSONObject> dto, HttpServletRequest request){
		JSONObject jsonObject = dto.getData();
		JSONObject projectVisitJson = jsonObject.getJSONObject("projectVisit");
		JSONObject projectJson = jsonObject.getJSONObject("project");
		ProjectVisit projectVisit = null;
		Project project = null;
		if (projectVisitJson!=null) projectVisit = JSON.parseObject(projectVisitJson.toString(),ProjectVisit.class);
		if (projectJson!=null) project = JSON.parseObject(projectJson.toString(),Project.class);
		ResultDto resultDto = cpProjectVisitService.saveProjectVisit(projectVisit,project);
		return new ResponseEntity<>(resultDto,HttpStatus.OK);
	}

	/**
	 * 查询回访列表
	 * @param dto
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getProjectVisitList", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> getProjectVisitList(@RequestBody RequestDto<Map<String, String>> dto, HttpServletRequest request){
			ResultDto resultDto = cpProjectVisitService.getProjectVisitList(dto.getData());
			return new ResponseEntity<>(resultDto, HttpStatus.OK);
	}
}