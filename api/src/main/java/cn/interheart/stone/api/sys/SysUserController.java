package cn.interheart.stone.api.sys;

import cn.interheart.stone.api.common.controller.BaseController;
import cn.interheart.stone.common.config.SysConfig;
import cn.interheart.stone.common.utils.EhcacheUtil;
import cn.interheart.stone.common.utils.IpUtil;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.SysUser;
import cn.interheart.stone.service.sys.SysUserService;
import com.alibaba.fastjson.JSON;
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
 * 系统用户
 * shikai
 */
@RestController
@RequestMapping("sys/sysUser")
public class SysUserController extends BaseController{
	@Resource
	SysUserService sysUserService;

	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<JSONObject> dto){
		JSONObject jsonObject = dto.getData();
		SysUser sysUser = JSON.parseObject(jsonObject.toJSONString(), SysUser.class);
		Integer roleId = jsonObject.getInteger("roleId");
		return new ResponseEntity<>(sysUserService.insert(sysUser, roleId), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<SysUser> dto){
		return new ResponseEntity<>(sysUserService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<JSONObject> dto){
		JSONObject jsonObject = dto.getData();
		SysUser sysUser = JSON.parseObject(jsonObject.toJSONString(), SysUser.class);
		Integer roleId = jsonObject.getInteger("roleId");
		return new ResponseEntity<>(sysUserService.update(sysUser, roleId), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<SysUser> dto){
		return new ResponseEntity<>(sysUserService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * list
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(sysUserService.extlist(dto.getData()), HttpStatus.OK);
	}


	/**
	 * 用户禁用OR启用
	 * @return
	 */
	@RequestMapping(value = "/sysUserStatus", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> sysUserStatus(@RequestBody RequestDto<SysUser> dto){
		return  new ResponseEntity<>(sysUserService.sysUserStatus(dto.getData()), HttpStatus.OK);
	}



	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> lgoin(@RequestBody RequestDto<Map<String, String>> dto , HttpServletRequest request){

		String sysLoginVerificationCode = getSessionAttr(SysConfig.SYS_VERIFICATION_CODE);
		removeSessionAttr(SysConfig.SYS_VERIFICATION_CODE);

		if (!StringUtils.equals(sysLoginVerificationCode, dto.getData().get(SysConfig.SYS_VERIFICATION_CODE).toLowerCase())){
			 ResultDto resultDto = new ResultDto();
			 resultDto.setCode("1");
			 resultDto.setMsg("验证码不正确!");
			return new ResponseEntity(resultDto, HttpStatus.OK);
		}

		ResultDto resultDto = sysUserService.login(dto.getData());
		if(resultDto.getCode().equals("0")){
			SysUser sysUser = (SysUser)resultDto.getData();
			String userToken = sysUserService.getUserToken();

			EhcacheUtil.setCache(SysConfig.SYS_USER_EHCACHE, Md5Helper.MD5(  userToken+ IpUtil.getIpAddr(request)), sysUser, Byte.valueOf("0") , 60*60*24*7, 1000);
			setCookie(SysConfig.SYS_USER_COOKIE,userToken, 60*60*24*7, "/" ,true);
			setSessionAttr(SysConfig.SYS_USER_SESSION, sysUser);
		}

		return  new ResponseEntity<>(sysUserService.login(dto.getData()), HttpStatus.OK);
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
		removeSessionAttr(SysConfig.SYS_USER_SESSION);
		String userToken = getCookie(SysConfig.SYS_USER_COOKIE,"");
		EhcacheUtil.removeCache(SysConfig.SYS_USER_EHCACHE, Md5Helper.MD5(userToken +IpUtil.getIpAddr(request)));
		removeCookie(SysConfig.SYS_USER_COOKIE);
		return  new ResponseEntity<>(resultDto, HttpStatus.OK);
	}



	/**
	 * 修改密码
	 * @return
	 */
	@RequestMapping(value = "/editPassword", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> editPassword(@RequestBody RequestDto<Map<String, String>> dto, HttpServletRequest request){
		String userToken = getCookie(SysConfig.SYS_USER_COOKIE,"");
		EhcacheUtil.removeCache(SysConfig.SYS_USER_EHCACHE, Md5Helper.MD5(userToken +IpUtil.getIpAddr(request)));
		removeCookie(SysConfig.SYS_USER_COOKIE);
		return  new ResponseEntity<>(sysUserService.editPassword(dto.getData()), HttpStatus.OK);
	}
}

