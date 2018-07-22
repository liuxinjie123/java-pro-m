package com.mira.manager.vo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Long id;						// 自增长主键
    private String userId;
    private String account;					// 登录的账号
    private String username;				// 注册的昵称
    private String status;
    private String salt;					// 用于加密的盐
    private String mobile;					// 手机号
    private String email;					// 邮箱
}
