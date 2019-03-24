package cn.interheart.stone.common.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author SHI_KAI
 * @date 2018年4月28日11:57:20
 * @description 短信配置类
 */
public class SmsConfig {
    /**
     *  阿里云key
     */
    public static String ACCESSKEY = "LTAIgKvh3UmojKvW";

    /**
     * 阿里云secret
     */
    public static String SECRETKEY = "N22hmb7hlfkFlrEa25Uh8KlndbUgC7";

    /**
     * 接口请求区域
     */
    public static String REGIONID = "cn-hangzhou";


    /**
     *短信签名
     */
    public static String SMSSIGN = "创崛石材";

    /**
     * 设置平台账号
     */
    public static String SYS_SET_ACCOUNT_SMS = "SMS_133970995";

    /**
     * 设置公司后台管理员账号短信
     */
    public static String SYS_SET_COMPANY_ACCOUNT_SMS = "SMS_133970996";

    /**
     * 重置公司账号新密码短信
     */
    public static String SYS_RESTER_COMPANY_ACCOUNT_SMS = "SMS_133960900";

    /**
     * 平台推广APP账号短信
     */
    public static String SYS_SOFTWARE_EXTENSION_ACCOUNT_SMS = "SMS_133971000";

    /**
     * 系统验证码
     */
    public static String SYS_VERIFICATION_CODE_SMS = "SMS_133976204";

    /**
     * 公司添加后台用户账号短信
     */
    public static String COMPANY_SYS_ACCOUNT_SMS = "SMS_133966005";

    /**
     * 公司添加app用户账号短信
     */
    public static String COMPANY_APP_ACCOUNT_SMS = "SMS_133960908";

}
