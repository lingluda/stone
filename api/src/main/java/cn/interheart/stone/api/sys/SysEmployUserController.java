package cn.interheart.stone.api.sys;

import cn.interheart.stone.dao.entity.EmployUser;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.sys.SysEmployUserService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;
@Api(tags = "推广账号")
@RestController
@RequestMapping("sys/employUser")
public class SysEmployUserController {
    @Resource
    SysEmployUserService sysEmployUserService;
    /**
     * 推广人员账号
     * @param dto
     * @return
     */
    @RequestMapping(value = "/spreadList", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> spreadList(@RequestBody RequestDto<Map<String, String>> dto){
        return  new ResponseEntity<>(sysEmployUserService.spreadList(dto.getData()), HttpStatus.OK);
    }

    /**
     * 插入推广人员账号
     * @param dto
     * @return
     */
    @RequestMapping(value = "/insertSpread" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto>  insertSpread(@RequestBody RequestDto<EmployUser> dto){
        return new ResponseEntity<>(sysEmployUserService.insertSpread(dto.getData()), HttpStatus.OK);
    }

    /**
     * 更新推广人员账号
     * @param dto
     * @return
     */
    @RequestMapping(value = "/updateSpread" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto>  updateSpread(@RequestBody RequestDto<EmployUser> dto){
        return new ResponseEntity<>(sysEmployUserService.updateSpread(dto.getData()), HttpStatus.OK);
    }



    /**
     * del
     * @return
     */
    @RequestMapping(value = "/delSpread" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> delSpread(@RequestBody RequestDto<EmployUser> dto){
        return new ResponseEntity<>(sysEmployUserService.delSpread(dto.getData().getId()), HttpStatus.OK);
    }

}
