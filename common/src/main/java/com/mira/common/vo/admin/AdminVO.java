package com.mira.common.vo.admin;

import com.mira.common.vo.BaseVO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminVO extends BaseVO {
    private String username;				// 登录的账号
    private String name;                    // 姓名
    private int status;
    private String number;                  // 工号
    private String mobile;					// 手机号
    private String email;					// 邮箱
    private int roleId;                     // 角色id
    private String roleName;                // 角色名称
}
