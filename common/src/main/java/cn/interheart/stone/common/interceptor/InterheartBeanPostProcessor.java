package cn.interheart.stone.common.interceptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

@Component
public class InterheartBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        InterheartProperties an = o.getClass().getAnnotation(InterheartProperties.class);
        if (an != null) {
            String fileName = an.fileName();
            String folderName = an.fileFolder();
            String nodePath=an.nodePath();
            if(!nodePath.equals("")){
                nodePath+=".";
            }
            if (fileName == null || fileName.equals("")) {
                String[] tmp = s.split("\\.");
                fileName = tmp[tmp.length - 1] + ".properties";
                fileName=firstCharUper(fileName);
            }else {
                fileName+=".properties";
            }
            if (folderName == null || folderName.equals("")) {
                folderName = System.getProperty("user.dir") + "/";
            }
            String fileFullPath = folderName + fileName;
            File f = new File(fileFullPath);
            InputStream in = null;
            if (f.exists()) {
                try {
                    in = new FileInputStream(fileFullPath);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                in =  getPropertiesStream(this.getClass().getClassLoader(),fileName);
            }
            if (in != null) {
                try {
                    Properties p = new Properties();
                    p.load(in);
                    in.close();
                    System.out.println(p);
                    for (Field field : o.getClass().getDeclaredFields()) {
                        field.setAccessible(true);
                        Object value = convertToType(p.get(nodePath+field.getName()) + "", field.getType());
                        if (value != null) {
                            try {
                                field.set(o, value);
                            }catch (Exception ex){
                                ex.printStackTrace();
                            }

                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getStackTrace());
                }
            }
        }

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }

    /*
    类型转换
    * */
    private <T> T convertToType(String str, Class<T> tClass) {
        T res = null;
        String classname=getClassName(tClass.getName()).toLowerCase();
        if (classname.equals("byte")) {
            Byte bt = 0;
            try {
                bt = Byte.parseByte(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            res = (T) bt;
        } else if (classname.equals("short")) {
            Short st = 0;
            try {
                st = Short.parseShort(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            res = (T) st;
        } else if (classname.equals("int") || classname.equals("integer")) {
            Integer st = 0;
            try {
                st = Integer.parseInt(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            res = (T) st;
        } else if (classname.equals("long")) {
            Long st = 0L;
            try {
                st = Long.parseLong(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            res = (T) st;
        } else if (classname.equals("double")) {
            Double st = 0d;
            try {
                st = Double.parseDouble(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            res = (T) st;
        } else if (classname.equals("boolean")) {
            Boolean b = false;
            try {
                b = Boolean.parseBoolean(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            res = (T) b;
        } else if (classname.equals("java.util.date")) {
            Date b = new Date();
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                b = sdf.parse(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            res = (T) b;
        } else {
            return (T) str;
        }
        return res;
    }

    /*
    递归获取资源流
    * */
    private InputStream getPropertiesStream(ClassLoader classLoader,String name){
        if(classLoader!=null){
           InputStream in=   classLoader.getResourceAsStream(name);
           if(in!=null) return in;
           return getPropertiesStream(classLoader.getParent(),name);
        }
        return null;
    }

    /*
    字符串首字母大写
    * */
    private String firstCharUper(String str){
        if(str!=null&&str.length()>0){
            char[] cs=str.toCharArray();
            cs[0]-=32;
            return String.valueOf(cs);
        }
        return str;
    }

    /*
    获取classname
    * */
    private String getClassName(String classname){
        String[] strs= classname.split("\\.");
        return strs[strs.length-1];
    }
}
