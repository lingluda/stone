package cn.interheart.stone.common.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Base64String {
    /**
     * 获取base64String
     *
     * @param bytes
     * @return
     */
    public static String getStringFromBytes(byte[] bytes) {
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(bytes);
    }

    /**
     * 获取base64String
     * @param str      要编码的字符串
     * @param codename 编码
     * @return
     */
    public static String getString(String str, String codename) throws UnsupportedEncodingException {
        BASE64Encoder encoder = new BASE64Encoder();
        byte[] bytes = str.getBytes(codename);
        return encoder.encode(bytes);
    }

    /**
     * 获取base64String
     *
     * @param str
     * @return
     */
    public static String getString(String str) throws UnsupportedEncodingException {
        return Base64String.getString(str, "utf-8");
    }


    /**
     * 从base64Str中获取字节
     *
     * @param base64Str
     * @return
     */
    public static byte[] getBytes(String base64Str) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        return decoder.decodeBuffer(base64Str);
    }

    /**
     * 从base解析出字符串
     *
     * @param base64Str
     * @param code
     * @return
     * @throws IOException
     */
    public static String getDeocdeString(String base64Str, String code) throws IOException {
        return new String(Base64String.getBytes(base64Str), code);
    }

    /**
     * 从base解析出字符串
     *
     * @param base64Str
     * @return
     * @throws IOException
     */
    public static String getDeocdeString(String base64Str) throws IOException {
        return new String(Base64String.getBytes(base64Str), "utf-8");
    }

    /**
     * 获取url安全字base64Str符串
     * @param base64Str
     * @return
     */
    public static String reflowURLSafeBase64(String base64Str) {
        return base64Str.replace("/","_").replace("+","-").replace("=","*");
    }

    /**
     * 获取原始base64Str
     * @param urlSafeBase64Str
     * @return
     */
    public static String reflowNormalBase64(String urlSafeBase64Str){
        return urlSafeBase64Str.replace("_","/").replace("-","+").replace("*","=");
    }
}
