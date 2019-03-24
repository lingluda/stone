package cn.interheart.stone.api.app;

import cn.interheart.stone.api.common.controller.BaseController;
import cn.interheart.stone.common.config.AppConfig;
import cn.interheart.stone.common.config.CpConfig;
import cn.interheart.stone.common.utils.EhcacheUtil;
import cn.interheart.stone.common.utils.IpUtil;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.CompanyUser;
import cn.interheart.stone.dao.entity.EmployUser;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.app.AppEmployUserService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
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
 * app用户管理
 */
@RestController
@RequestMapping("/app/EmployUser")
public class AppEmployUserController extends BaseController{

    @Resource
    AppEmployUserService appEmployUserService;

    /**
     * 登录
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> login(@RequestBody RequestDto<Map<String, String>> dto, HttpServletRequest request){

        ResultDto resultDto = appEmployUserService.login(dto.getData());
        if(resultDto.getCode().equals("0")) {
            JSONObject resObject = (JSONObject) resultDto.getData();
            EmployUser employUser = (EmployUser) resObject.get("employUser");
            resObject.remove("employUser");

            String userToken = appEmployUserService.getUserToken();
            resObject.put("employUserId", employUser.getId());
            resObject.put("userToken", userToken);
            EhcacheUtil.setCache(AppConfig.APP_USER_EHCACHE, Md5Helper.MD5(userToken + IpUtil.getIpAddr(request)), employUser, Byte.valueOf("0"), 60 * 60 * 24 * 7, 1000);
        }
        return  new ResponseEntity<>(resultDto, HttpStatus.OK);
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping(value = "/loginOut", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> loginOut(HttpServletRequest request){
        ResultDto resultDto = new ResultDto();
        resultDto.setCode("0");
        resultDto.setMsg("退出成功!");
        String userToken = request.getHeader("userToken");
        EhcacheUtil.removeCache(AppConfig.APP_USER_EHCACHE, Md5Helper.MD5(userToken +IpUtil.getIpAddr(request)));
        removeCookie(AppConfig.APP_USER_COOKIE);
        return  new ResponseEntity<>(resultDto, HttpStatus.OK);
    }

    /**
     * 修改密码
     * @return
     */
    @RequestMapping(value = "/editPassword", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> editPassword(@RequestBody RequestDto<Map<String, String>> dto, HttpServletRequest request){
        String userToken = request.getHeader("userToken");
        EhcacheUtil.removeCache(AppConfig.APP_USER_EHCACHE, Md5Helper.MD5(userToken +IpUtil.getIpAddr(request)));
        return  new ResponseEntity<>(appEmployUserService.editPassword(dto.getData()), HttpStatus.OK);
    }



    /**
     * 用户详情
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> info(@RequestBody RequestDto<EmployUser> dto, HttpServletRequest request){
        return  new ResponseEntity<>(appEmployUserService.info(dto.getData().getId()), HttpStatus.OK);
    }
}
