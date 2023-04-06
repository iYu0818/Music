package com.example.iYu.config;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* @Description:
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/3/8
*/
public class CorsInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x_requested_with,x-requested-with,Authorization,Content-Type,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        return true;
    }
}
