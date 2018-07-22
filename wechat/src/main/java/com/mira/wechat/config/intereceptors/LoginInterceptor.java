package com.mira.wechat.config.intereceptors;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        if (handler instanceof HandlerMethod) {
//            if (!session.isLogined()) {
//                String url=request.getRequestURI();
//                if(request.getQueryString()!=null)
//                    url=url+"?"+request.getQueryString();
//                throw new UnauthorizedException(url);
//            }
//        }
        return super.preHandle(request, response, handler);
    }
}
