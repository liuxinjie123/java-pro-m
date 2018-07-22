package com.mira.manager.config.intereceptors;

import com.mira.manager.config.Session;
import com.mira.common.exception.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    protected Session session;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            if (!session.isLogined()) {
                String url=request.getRequestURI();
                if(request.getQueryString()!=null)
                    url=url+"?"+request.getQueryString();
                throw new UnauthorizedException(url);
            }
        }
        return super.preHandle(request, response, handler);
    }
}
