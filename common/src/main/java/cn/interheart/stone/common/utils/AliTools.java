
package cn.interheart.stone.common.utils;

import cn.interheart.stone.common.config.SmsConfig;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.sms.model.v20160927.SingleSendSmsRequest;
import com.aliyuncs.sms.model.v20160927.SingleSendSmsResponse;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.rmi.ServerException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Administrator on 2017/3/31.
 * 调用阿里工具类
 */

@Service
public class AliTools {
    /**
     * 发送短信
     *
     * @recNum 手机号码
     * @paramString 模板对应参数
     * @templateCode 模板编号
     */

    public boolean sendMsg(String recNum, String paramString, String templateCode) {
        try {
            IClientProfile profile = DefaultProfile.getProfile(SmsConfig.REGIONID, SmsConfig.ACCESSKEY, SmsConfig.SECRETKEY);
            DefaultProfile.addEndpoint("cn-hangzhou", SmsConfig.REGIONID, "Sms", "sms.aliyuncs.com");
            IAcsClient client = new DefaultAcsClient(profile);
            SingleSendSmsRequest request = new SingleSendSmsRequest();
            request.setSignName(SmsConfig.SMSSIGN);//控制台创建的签名名称
            request.setTemplateCode(templateCode);//控制台创建的模板CODE
            request.setParamString(paramString);//短信模板中的变量；数字需要转换为字符串；个人用户每个变量长度必须小于15个字符。"
            //request.setParamString("{}");
            request.setRecNum(recNum);//接收号码
            SingleSendSmsResponse httpResponse = client.getAcsResponse(request);
            return true;
        } catch (com.aliyuncs.exceptions.ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean sendMsgNew(String recNum, String paramString, String templateCode) {
        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile(SmsConfig.REGIONID, SmsConfig.ACCESSKEY, SmsConfig.SECRETKEY);
        try {
            DefaultProfile.addEndpoint("cn-hangzhou", SmsConfig.REGIONID, "Dysmsapi", "Dysmsapi.aliyuncs.com");
        } catch (ClientException e) {
            e.printStackTrace();
        }
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(recNum);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName(SmsConfig.SMSSIGN);
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode(templateCode);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam(paramString);

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId("0");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse=null;
        try {
             sendSmsResponse = acsClient.getAcsResponse(request);

        } catch (ClientException e) {
            e.printStackTrace();
            return  false;
        }
        return true;
    }

    public static  void main(String[] args){
        AliTools aliTools = new AliTools();

        aliTools.sendMsgNew("15878306309", "{\"account\":\"shikai\", \"password\":\"123456\"}", SmsConfig.SYS_SOFTWARE_EXTENSION_ACCOUNT_SMS);
    }
}
