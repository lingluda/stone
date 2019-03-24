package cn.interheart.stone.api.common.intercept;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ResAccCode {
    @AliasFor("value")
    String resCode() default "";

    @AliasFor("resCode")
    String value() default "";

    String redirectUrl() default "/";
}
