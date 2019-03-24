/*
package cn.interheart.stone.api.common.webintercept;

import cn.farmer.api.dto.UserSessionDTO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebBackBaseAction {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private UserSessonUtil userSessonUtil;

    public UserSessionDTO getLoginUser(){
       return userSessonUtil.getLoginUserFromRequest(request);
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }
}
*/
