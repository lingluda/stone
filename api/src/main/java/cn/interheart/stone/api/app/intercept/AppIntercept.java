package cn.interheart.stone.api.app.intercept;

import cn.interheart.stone.api.common.controller.BaseController;
import cn.interheart.stone.common.config.AppConfig;
import cn.interheart.stone.common.config.CpConfig;
import cn.interheart.stone.common.utils.EhcacheUtil;
import cn.interheart.stone.common.utils.IpUtil;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.CompanyUser;
import cn.interheart.stone.dao.entity.EmployUser;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.service.cp.CpCompanyUserService;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppIntercept implements HandlerInterceptor {


    @Resource
    BaseController baseController;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userTokenHead = request.getHeader("userToken");
        String ip = IpUtil.getIpAddr(request);
        ResultDto resultDto = new ResultDto();
        resultDto.setCode("302");
        resultDto.setMsg("请登录!");
        response.setContentType("application/json; charset=utf-8");
        response.setCharacterEncoding("utf-8");

        if (StringUtils.isBlank(userTokenHead)) {
            response.getWriter().print(JSON.toJSON(resultDto));
            response.getWriter().close();
            return false;
        }

        EmployUser employUser = (EmployUser) EhcacheUtil.getCache(AppConfig.APP_USER_EHCACHE, Md5Helper.MD5(userTokenHead + ip));
        if(employUser == null){
            response.getWriter().print(JSON.toJSON(resultDto));
            response.getWriter().close();
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
