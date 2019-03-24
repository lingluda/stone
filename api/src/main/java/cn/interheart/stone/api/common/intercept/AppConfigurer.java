package cn.interheart.stone.api.common.intercept;

import cn.interheart.stone.api.app.intercept.AppIntercept;
import cn.interheart.stone.api.cp.intercept.CpIntercept;
import cn.interheart.stone.api.sys.intercept.SysIntercept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppConfigurer extends WebMvcConfigurerAdapter {

    @Bean
    public SysIntercept SysIntercept() {
        return new SysIntercept();
    }

    @Bean
    public CpIntercept CpIntercept(){return new CpIntercept();}

    @Bean
    AppIntercept AppIntercept(){ return  new AppIntercept();}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        //registry.addInterceptor(new WebBackAuthorInterceptor()).addPathPatterns("/web/**");
        //registry.addInterceptor(new H5Interceptor()).addPathPatterns("/wx/**");
        //registry.addInterceptor(SysIntercept()).addPathPatterns("/sys/**").excludePathPatterns("/sys/sysUser/login");
        //registry.addInterceptor(CpIntercept()).addPathPatterns("/cp/**").excludePathPatterns("/cp/companyUser/login");
        //registry.addInterceptor(AppIntercept()).addPathPatterns("/app/**").excludePathPatterns("/app/EmployUser/login");
        super.addInterceptors(registry);

    }

}
