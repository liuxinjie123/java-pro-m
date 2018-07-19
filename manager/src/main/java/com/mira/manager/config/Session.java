package com.mira.manager.config;

import com.mira.manager.vo.user.User;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Session implements Serializable {
    protected User user;

    public User getUser() {
        return user;
    }

    public boolean login(User user) {
        this.user = user;
        return true;
    }

    public boolean isLogined() {
        return this.user != null;
    }

    public void logout() {
        this.user = null;
    }

}
