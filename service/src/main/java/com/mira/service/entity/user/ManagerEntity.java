package com.mira.service.entity.user;

import com.mira.service.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Entity
@Table(name = "m_u_users")
@Data
@NoArgsConstructor
public class ManagerEntity extends BaseEntity implements Serializable {
    @Column(name = "username")
    private String username;				// 登录的账号

    @Transient
    private String plainPassword;           // 未加密的密码，不存到数据库

    @Column(name = "password")
    private String password;				// 加密后的密码

    @Column(name = "name")
    private String name;                    // 姓名

    @Column(name = "status")
    private String status;

    @Column(name = "number")
    private String number;                  // 工号

    @Column(name = "mobile")
    private String mobile;					// 手机号

    @Column(name = "email")
    private String email;					// 邮箱

    @Column(name = "role_id")
    private int roleId;                     // 角色id

    @Column(name = "role_name")
    private String roleName;                // 角色名称

    @Column(name = "salt")
    private String salt;					// 用于加密的盐


}
