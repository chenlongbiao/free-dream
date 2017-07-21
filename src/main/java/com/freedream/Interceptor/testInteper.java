package com.freedream.Interceptor;

import org.glassfish.hk2.classmodel.reflect.util.InputStreamArchiveAdapter;
import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by 陈龙飚 on 2017/7/17.
 */
public class testInteper implements HandlerInterceptor{
    final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(testInteper.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        String authType = request.getAuthType();
//        String authType1 = request.getQueryString();
//        Map<String, String[]> parameterMap = request.getParameterMap();
//        System.out.println(parameterMap.values()+"------------------"+authType1);
    }
}
