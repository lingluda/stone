package cn.interheart.stone.api.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@RestController
/**
 * @author SHI_KAI
 * @date 2018/4/23 16:06
 * @description 公共继承Controller
 */
public  class BaseController {
    @Autowired
    private  HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;



    public <T> T getSessionAttr(String key) {
        HttpSession session = this.request.getSession(false);
        return session != null ? (T) session.getAttribute(key) : null;
    }

    public void setSessionAttr(String key, Object value) {
        this.request.getSession(true).setAttribute(key, value);
    }

    public void removeSessionAttr(String key) {
        HttpSession session = this.request.getSession(false);
        if (session != null) {
            session.removeAttribute(key);
        }
    }

    public String getCookie(String name, String defaultValue) {
        Cookie cookie = this.getCookieObject(name);
        return cookie != null ? cookie.getValue() : defaultValue;
    }

    public String getCookie(String name) {
        return this.getCookie(name, (String)null);
    }

    public Integer getCookieToInt(String name) {
        String result = this.getCookie(name);
        return result != null ? Integer.parseInt(result) : null;
    }

    public Integer getCookieToInt(String name, Integer defaultValue) {
        String result = this.getCookie(name);
        return result != null ? Integer.parseInt(result) : defaultValue;
    }

    public Long getCookieToLong(String name) {
        String result = this.getCookie(name);
        return result != null ? Long.parseLong(result) : null;
    }

    public Long getCookieToLong(String name, Long defaultValue) {
        String result = this.getCookie(name);
        return result != null ? Long.parseLong(result) : defaultValue;
    }

    public Cookie getCookieObject(String name) {
        Cookie[] cookies = this.request.getCookies();
        if (cookies != null) {
            Cookie[] var3 = cookies;
            int var4 = cookies.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Cookie cookie = var3[var5];
                if (cookie.getName().equals(name)) {
                    return cookie;
                }
            }
        }

        return null;
    }

    public Cookie[] getCookieObjects() {
        Cookie[] result = this.request.getCookies();
        return result != null ? result : new Cookie[0];
    }

    public void setCookie(String name, String value, int maxAgeInSeconds, boolean isHttpOnly) {
         this.doSetCookie(name, value, maxAgeInSeconds, (String)null, (String)null, isHttpOnly);
    }

    public void setCookie(String name, String value, int maxAgeInSeconds) {
         this.doSetCookie(name, value, maxAgeInSeconds, (String)null, (String)null, (Boolean)null);
    }

    public void setCookie(Cookie cookie) {
        this.response.addCookie(cookie);
    }

    public void setCookie(String name, String value, int maxAgeInSeconds, String path, boolean isHttpOnly) {
         this.doSetCookie(name, value, maxAgeInSeconds, path, (String)null, isHttpOnly);
    }

    public void setCookie(String name, String value, int maxAgeInSeconds, String path) {
         this.doSetCookie(name, value, maxAgeInSeconds, path, (String)null, (Boolean)null);
    }

    public void setCookie(String name, String value, int maxAgeInSeconds, String path, String domain, boolean isHttpOnly) {
         this.doSetCookie(name, value, maxAgeInSeconds, path, domain, isHttpOnly);
    }

    public void removeCookie(String name) {
         this.doSetCookie(name, (String)null, 0, (String)null, (String)null, (Boolean)null);
    }

    public void removeCookie(String name, String path) {
         this.doSetCookie(name, (String)null, 0, path, (String)null, (Boolean)null);
    }

    public void removeCookie(String name, String path, String domain) {
         this.doSetCookie(name, (String)null, 0, path, domain, (Boolean)null);
    }

    private void doSetCookie(String name, String value, int maxAgeInSeconds, String path, String domain, Boolean isHttpOnly) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(maxAgeInSeconds);
        if (path == null) {
            path = "/";
        }

        cookie.setPath(path);
        if (domain != null) {
            cookie.setDomain(domain);
        }

        if (isHttpOnly != null) {
            cookie.setHttpOnly(isHttpOnly);
        }

        this.response.addCookie(cookie);
    }

}
