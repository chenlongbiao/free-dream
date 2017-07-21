package com.freedream.filter;

/**
 * Created by 陈龙飚 on 2017/7/21.
 */
import com.freedream.Interceptor.testInteper;
import com.freedream.utils.GetBodyWrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "/*")
public class HttpServletRequestReplacedFilter implements Filter {
    final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(testInteper.class);

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        ServletRequest requestWrapper = null;
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            if ("POST".equals(httpServletRequest.getMethod().toUpperCase())) {

                requestWrapper = new GetBodyWrapper(
                        (HttpServletRequest) request);
                //请求的流
                BufferedReader reader = requestWrapper.getReader();
                //请求方式
                String method = ((HttpServletRequest) request).getMethod();
                //请求路径
                String servletPath = ((HttpServletRequest) request).getServletPath();
                char[] chars= new char[2048];
                int a=0;
                String s="";
                String s1="";
                reader.read(chars);
                reader.close();
                s1= String.valueOf(chars);
                logger.info("请求方式 ："+method);
                logger.info("服务名称 ："+servletPath);
                logger.info("请求参数 ：" +s1);
            }
        }

        if (requestWrapper == null) {
            chain.doFilter(request, response);
        } else {
            chain.doFilter(requestWrapper, response);
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }

}
