package cn.interheart.stone.api.common.intercept;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseAuthorInterceptor implements HandlerInterceptor {
    private String resCode;
    private String redirectUrl;

    public abstract boolean AuthorCheck(String resCode, String redirectUrl, HttpServletRequest httpServletRequest, HttpServletResponse response);

    public boolean isMyHandler(Object handler) {
        if (!(handler instanceof HandlerMethod)) {
            return false;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        ResAccCode resAccCode = handlerMethod.getMethodAnnotation(ResAccCode.class);
        if (resAccCode == null) {
            return false;
        }
        resCode = resAccCode.resCode();
        redirectUrl = resAccCode.redirectUrl();
        return true;
    }

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        if (isMyHandler(o)) {
            return this.AuthorCheck(this.resCode, this.redirectUrl, httpServletRequest, httpServletResponse);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
