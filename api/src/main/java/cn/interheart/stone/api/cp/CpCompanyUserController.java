package cn.interheart.stone.api.cp;

import cn.interheart.stone.api.common.controller.BaseController;
import cn.interheart.stone.common.config.CpConfig;
import cn.interheart.stone.common.config.SysConfig;
import cn.interheart.stone.common.utils.EhcacheUtil;
import cn.interheart.stone.common.utils.IpUtil;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.CompanyUser;
import cn.interheart.stone.dao.entity.RequestDto;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.SysUser;
import cn.interheart.stone.service.cp.CpCompanyUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Map;

/**
 * 公司账号
 * shikai
 */
@RestController
@RequestMapping("cp/companyUser")
public class CpCompanyUserController extends BaseController{
	@Resource
	CpCompanyUserService cpCompanyUserService;
	/**
	 * insert
	 * @return
	 */
	@RequestMapping(value = "/insert" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> insert(@RequestBody RequestDto<CompanyUser> dto){

		return new ResponseEntity<>(cpCompanyUserService.insert(dto.getData()), HttpStatus.OK);
	}

	/**
	 * del
	 * @return
	 */
	@RequestMapping(value = "/del" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> del(@RequestBody RequestDto<CompanyUser> dto){
		return new ResponseEntity<>(cpCompanyUserService.del(dto.getData().getId()), HttpStatus.OK);
	}

	/**
	 * update
	 * @return
	 */
	@RequestMapping(value = "/update" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> update(@RequestBody RequestDto<CompanyUser> dto){
		return new ResponseEntity<>(cpCompanyUserService.update(dto.getData()), HttpStatus.OK);

	}
	/**
	 * info
	 * @return
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto>  info(@RequestBody RequestDto<CompanyUser> dto){
		return new ResponseEntity<>(cpCompanyUserService.info(dto.getData().getId()), HttpStatus.OK);
	}


	/**
	 * 账户列表
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> extList(@RequestBody RequestDto<Map<String, String>> dto){
		return  new ResponseEntity<>(cpCompanyUserService.extList(dto.getData()), HttpStatus.OK);
	}



	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ResultDto> login(@RequestBody RequestDto<Map<String, String>> dto, HttpServletRequest request){

		String companyLoginVerificationCode = getSessionAttr(CpConfig.COMPANY_VERIFICATION_CODE);
		removeSessionAttr(CpConfig.COMPANY_VERIFICATION_CODE);

		if (!StringUtils.equals(companyLoginVerificationCode, dto.getData().get(CpConfig.COMPANY_VERIFICATION_CODE).toLowerCase())){
			ResultDto resultDto = new ResultDto();
			resultDto.setCode("1");
			resultDto.setMsg("验证码不正确!");
			return new ResponseEntity(resultDto, HttpStatus.OK);
		}

		ResultDto resultDto = cpCompanyUserService.login(dto.getData());

		if(resultDto.getCode().equals("0")) {
			Map resMap = (Map) resultDto.getData();
			CompanyUser companyUser = (CompanyUser) resMap.get("companyUser");

			String userToken = cpCompanyUserService.getUserToken();

			EhcacheUtil.setCache(CpConfig.COMPANY_USER_EHCACHE, Md5Helper.MD5(userToken + IpUtil.getIpAddr(request)), companyUser, Byte.valueOf("0"), 60 * 60 * 24 * 7, 1000);
			setCookie(CpConfig.COMPANY_USER_COOKIE, userToken, 60 * 60 * 24 * 7, "/", true);
			setSessionAttr(CpConfig.COMPANY_USER_SESSION, companyUser);
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
        removeSessionAttr(CpConfig.COMPANY_USER_SESSION);
		String userToken = getCookie(CpConfig.COMPANY_USER_COOKIE,"");
		EhcacheUtil.removeCache(CpConfig.COMPANY_USER_EHCACHE, Md5Helper.MD5(userToken +IpUtil.getIpAddr(request)));
		removeCookie(CpConfig.COMPANY_USER_COOKIE);
        return  new ResponseEntity<>(resultDto, HttpStatus.OK);
    }



    /**
     * 修改密码
     * @return
     */
    @RequestMapping(value = "/editPassword", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResultDto> editPassword(@RequestBody RequestDto<Map<String, String>> dto, HttpServletRequest request){
		String userToken = getCookie(CpConfig.COMPANY_USER_COOKIE,"");
		EhcacheUtil.removeCache(CpConfig.COMPANY_USER_EHCACHE, Md5Helper.MD5(userToken +IpUtil.getIpAddr(request)));
		removeCookie(CpConfig.COMPANY_USER_COOKIE);
		return  new ResponseEntity<>(cpCompanyUserService.editPassword(dto.getData()), HttpStatus.OK);
    }
}