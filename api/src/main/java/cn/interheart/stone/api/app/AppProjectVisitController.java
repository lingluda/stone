package cn.interheart.stone.api.app;

import cn.interheart.stone.api.common.controller.BaseController;
import cn.interheart.stone.dao.entity.*;
import cn.interheart.stone.service.app.AppEmployUserService;
import cn.interheart.stone.service.app.AppProjectVisitService;
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
 * 客户状态-回访
 */
@RestController
@RequestMapping("/app/projectVisit")
public class AppProjectVisitController extends BaseController{

    @Resource
    AppEmployUserService appEmployUserService;
    @Resource
    AppProjectVisitService appProjectVistService;

    /**
     * 查询客户项目拜访列表
     * @param dto
     * @param request
     * @return
     */
    @RequestMapping(value = "/getCustomerVisitList", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> getCustomerVisitList(@RequestBody RequestDto<Map<String, String>> dto, HttpServletRequest request){
        ResultDto resultDto = appProjectVistService.getCustomerVisitList(dto.getData());
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
        ResultDto resultDto = appProjectVistService.getProjectVisitList(dto.getData());
        return new ResponseEntity<>(resultDto, HttpStatus.OK);
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
        ResultDto resultDto = appProjectVistService.saveProjectVisit(projectVisit,project);
        return new ResponseEntity<>(resultDto,HttpStatus.OK);
    }
}
