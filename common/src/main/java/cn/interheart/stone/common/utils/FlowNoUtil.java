package cn.interheart.stone.common.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlowNoUtil {
    private static final DateFormat FORMAT = new SimpleDateFormat("yyMMdd");
    public static String next(){
        return  FORMAT.format(new Date())+Long.toHexString(System.currentTimeMillis()).toUpperCase();
    }
    public static String next(String tail){
        return  FORMAT.format(new Date())+Long.toHexString(System.currentTimeMillis()).toUpperCase()+tail;
    }
}
