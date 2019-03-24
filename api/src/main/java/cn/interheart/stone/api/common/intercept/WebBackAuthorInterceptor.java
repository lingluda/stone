/*
package cn.interheart.stone.api.common.webintercept;

import cn.farmer.api.dto.UserSessionDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebBackAuthorInterceptor extends BaseAuthorInterceptor {
    @Override
    public boolean AuthorCheck(String resCode, String redirectUrl, HttpServletRequest request, HttpServletResponse response) {
        UserSessionDTO userInfo = userSessonUtil().getLoginUserFromRequest(request);
        if (userInfo != null &&(resCode == null || resCode.isEmpty())) {
            return true;
        }
        if (userInfo != null && userInfo.getResCodeList().stream().anyMatch(r -> r.equals(resCode))) {
            return true;
        }
        PrintWriter p = null;
        try {
            response.setContentType("application/json;charset=utf-8");
            p = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (userInfo == null) {
            p.write( "{\"code\":\"401\",\"msg\":\"用户未登录\"}");
            return false;
        }
        p.write("{\"code\":\"403\",\"msg\":\"无此权限\"}");
        return false;
    }

    private UserSessonUtil userSessonUtil() {
        return FarmerApplicationContext.getBean(UserSessonUtil.class);
    }

}
*/
