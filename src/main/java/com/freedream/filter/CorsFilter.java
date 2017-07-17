package com.freedream.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

@WebFilter(urlPatterns="/*")
public class CorsFilter implements Filter {
  
    final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CorsFilter.class);  
  
  
  
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {  
        HttpServletResponse response = (HttpServletResponse) res;  
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        System.out.println();
        logger.info("*********************************过滤器被使用**************************");
//        BufferedReader reader = (BufferedReader) inputStream;
        HttpServletRequest req1 = (HttpServletRequest) req;
        Map<String, String[]> parameterMap = req1.getParameterMap();
//        Collection<Part> parts = req1.getParts();
//        logger.info(parts.toString()+"");
        String authType = req1.getAuthType();
        String method = req1.getMethod();
        Enumeration<String> attributeNames = req1.getAttributeNames();
        logger.info(req1.getContextPath()+"");
        logger.info(attributeNames+"");
        chain.doFilter(req, res);
//        logger.info("*********************************过滤器被使用**************************");
    }  
    public void init(FilterConfig filterConfig) {}  
    public void destroy() {}  
} 