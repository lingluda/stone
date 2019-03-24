package cn.interheart.stone.api.cp.intercept;

import cn.interheart.stone.api.common.controller.BaseController;
import cn.interheart.stone.common.config.CpConfig;
import cn.interheart.stone.common.config.SysConfig;
import cn.interheart.stone.common.utils.EhcacheUtil;
import cn.interheart.stone.common.utils.IpUtil;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.CompanyUser;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.SysUser;
import cn.interheart.stone.service.cp.CpCompanyUserService;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CpIntercept  implements HandlerInterceptor {


    @Resource
    BaseController baseController;

    @Resource
    CpCompanyUserService cpCompanyUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        CompanyUser companyUser = baseController.getSessionAttr(CpConfig.COMPANY_USER_SESSION);
        String userToken = baseController.getCookie(CpConfig.COMPANY_USER_COOKIE, "");
        String ip = IpUtil.getIpAddr(request);
        ResultDto resultDto = new ResultDto();
        if(companyUser == null){
            companyUser = (CompanyUser) EhcacheUtil.getCache(CpConfig.COMPANY_USER_EHCACHE,  Md5Helper.MD5(userToken + ip));
        }

        if(companyUser == null){
            resultDto.setCode("302");
            resultDto.setMsg("请登录!");
            response.setContentType("application/json; charset=utf-8");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(JSON.toJSON(resultDto));
            response.getWriter().close();
            return false;
        }

        EhcacheUtil.setCache(CpConfig.COMPANY_USER_EHCACHE, userToken, companyUser);
        baseController.setSessionAttr(CpConfig.COMPANY_USER_SESSION, companyUser);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
