package com.freedream.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by 陈龙飚 on 2017/7/17.
 */
@Configuration
public class addInterceptor extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        System.out.println("-----------------------------------------");
        registry.addInterceptor(new testInteper()).addPathPatterns("/**");
    }
}
