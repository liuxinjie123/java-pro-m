package com.mira.common.dto.admin;

import com.mira.common.dto.BaseDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AdminDTO extends BaseDTO implements Serializable {
    private String username;				// 登录的账号
    private String name;                    // 姓名
    private int status;
    private String number;                  // 工号
    private String mobile;					// 手机号
    private String email;					// 邮箱
    private int roleId;                     // 角色id
    private String roleName;                // 角色名称
    private String salt;					// 用于加密的盐
}
