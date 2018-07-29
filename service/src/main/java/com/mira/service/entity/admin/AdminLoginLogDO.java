package com.mira.service.entity.admin;

import com.mira.service.entity.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "m_admins_login_log")
@Data
@NoArgsConstructor
public class AdminLoginLogDO extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;						                // 自增长主键
    @Column(name = "admin_id")
    private String adminId;          //admin id
    @Column(name = "username")
    private String username;         //用户登录名
}
