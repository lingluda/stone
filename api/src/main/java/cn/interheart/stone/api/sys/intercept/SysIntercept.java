package cn.interheart.stone.api.sys.intercept;

import cn.interheart.stone.api.common.controller.BaseController;
import cn.interheart.stone.common.config.SysConfig;
import cn.interheart.stone.common.utils.EhcacheUtil;
import cn.interheart.stone.common.utils.IpUtil;
import cn.interheart.stone.common.utils.Md5Helper;
import cn.interheart.stone.dao.entity.ResultDto;
import cn.interheart.stone.dao.entity.SysUser;
import com.alibaba.fastjson.JSON;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SysIntercept implements HandlerInterceptor {


  @Resource
  BaseController baseController;

    /**
     * 请求之后执行，用于清理资源
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,  Object handler) throws Exception {
      SysUser sysUser = baseController.getSessionAttr(SysConfig.SYS_USER_SESSION);
      String userToken = baseController.getCookie(SysConfig.SYS_USER_COOKIE,"");
      ResultDto resultDto = new ResultDto();

      if(sysUser == null){
        sysUser = (SysUser) EhcacheUtil.getCache(SysConfig.SYS_USER_EHCACHE, Md5Helper.MD5(userToken +IpUtil.getIpAddr(request)));
      }

      if(sysUser == null){
        resultDto.setCode("302");
        resultDto.setMsg("请登录!");
        response.setContentType("application/json; charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().print(JSON.toJSON(resultDto));
        response.getWriter().close();
        return false;
      }

      EhcacheUtil.setCache(SysConfig.SYS_USER_EHCACHE, userToken, sysUser);
      baseController.setSessionAttr(SysConfig.SYS_USER_SESSION, sysUser);
      return true;
    }

    /**
     * Controller调用之后执行，可对ModelAndView操作
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * preHandle拦截使用，在controller执行之前
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
