package cn.interheart.stone.common.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTools {
    public static ApplicationContext spcontext=null;
    public  static void initialtSpring() {
         spcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
