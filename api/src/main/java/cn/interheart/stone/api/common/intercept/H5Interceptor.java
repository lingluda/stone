package cn.interheart.stone.api.common.intercept;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class H5Interceptor implements HandlerInterceptor {

    //private static FarmerConfigs farmerConfigs=FarmerApplicationContext.getBean(FarmerConfigs.class);


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        if(isMyHandler(o)){
            Cookie[] cookies= httpServletRequest.getCookies();
            String url=httpServletRequest.getParameter("url");
            if(cookies!=null&&cookies.length>0){
              List<Cookie> cks= Arrays.stream(cookies).filter(r->r.getName().equals("openid")).collect(Collectors.toList());
              if(cks.size()>0){
                  if(!cks.get(0).getValue().isEmpty()&&!cks.get(0).getValue().equals(null)){
                      httpServletResponse.sendRedirect(URLDecoder.decode (url,"utf-8"));
                  }
              }
            }
            //url= URLEncoder.encode(farmerConfigs.getWxH5AuthorBackUrl()+"?bk="+Base64String.reflowURLSafeBase64(Base64String.getString(url)),"utf-8");
            //httpServletResponse.sendRedirect(MessageFormat.format ("{0}?url={1}",farmerConfigs.getWxAuthorSite(),url));
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    public boolean isMyHandler(Object handler) {
        if (!(handler instanceof HandlerMethod)) {
            return false;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        H5Annotation resAccCode = handlerMethod.getMethodAnnotation(H5Annotation.class);
        if (resAccCode == null) {
            return false;
        }
        return true;
    }
}
