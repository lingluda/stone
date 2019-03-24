package cn.interheart.stone.api.sys;

import cn.interheart.stone.dao.entity.CompanyUser;
import cn.interheart.stone.dao.entity.EmployUser;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.sys.SysCompanyUserService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Api(tags = "公司推广账号")
@RestController
@RequestMapping("sys/companyUser")
public class SysCompanyUserController {
    @Resource
    SysCompanyUserService sysCompanyUserService;

    @RequestMapping(value = "/delSpread" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> delSpread(@RequestBody RequestDto<CompanyUser> dto){
        return new ResponseEntity<>(sysCompanyUserService.del(dto.getData().getId()), HttpStatus.OK);
    }
    /**
     * 插入公司管理员账号
     * @param dto
     * @return
     */
    @RequestMapping(value = "/insertSpread" , method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto>  insertSpread(@RequestBody RequestDto<CompanyUser> dto){
        return new ResponseEntity<>(sysCompanyUserService.add(dto.getData()), HttpStatus.OK);
    }


}
