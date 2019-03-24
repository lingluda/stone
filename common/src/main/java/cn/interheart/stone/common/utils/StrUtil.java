package cn.interheart.stone.common.utils;

import java.util.HashMap;

public class StrUtil {
    /**
     * 判断字符串是不是空，或者null
     * @param str
     * @return  空||null 返回false else true
     */
    public  static  boolean notNullOrEmpty(String... str){
        boolean flag = true;
        for (String s : str) {
            if(s==null||"".equals(s)){
                flag = false;
            }
        }
        return  flag;
    }
    public  static  boolean notDoubleNull(Double... str){
        for (Double s : str) {
            if(s == null){
                return false;
            }
        }
        return true;
    }

    public static boolean integerNotNull(Integer... str){
        for (Integer s : str) {
            if (s != null && s != 0) {
                return false;
            }
        }
        return true;
    }

    public static HashMap<String,Object> getParam(HashMap<String,Object> param){
        if(param.get("page")==null){
            param.put("page",1);
        }
        if(param.get("rows")==null){
            param.put("rows",10);
        }
        param.put("page",(Integer.valueOf(param.get("page").toString()) -1)*Integer.valueOf(param.get("rows").toString()));
        param.put("rows",Integer.valueOf(param.get("rows").toString()));
        return param;
    }
}
