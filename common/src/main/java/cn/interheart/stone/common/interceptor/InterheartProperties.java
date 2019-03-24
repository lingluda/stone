package cn.interheart.stone.common.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InterheartProperties {
    /*
    配置文件名称（默认值，文件类名）
    * */
    String fileName() default "";
    /*
    配置文件路径（不填写时，默认搜索顺序：程序的根目录->运行包内）
    * */
    String fileFolder() default "";
    /*
    值节点
    * */
    String nodePath() default "";
}
