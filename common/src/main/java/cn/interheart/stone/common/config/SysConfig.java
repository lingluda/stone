package cn.interheart.stone.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class SysConfig {
    /**
     * SYS后台用户 seesion key
     */
    public static String SYS_USER_SESSION = "sysUserSession";
    /**
     * SYS后台用户 cookie key
     */
    public static String SYS_USER_COOKIE = "sysUserCookie";
    /**
     * 后台登录验证码
     */
    public static String SYS_VERIFICATION_CODE = "sysLoginVerificationCode";

    /**
     * 用户缓存KEY
     */
    public static String SYS_USER_EHCACHE = "sysUserEhcache";


}
