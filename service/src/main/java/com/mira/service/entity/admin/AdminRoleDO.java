package com.mira.service.entity.admin;

import com.mira.service.entity.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "m_admins_role")
@Data
@NoArgsConstructor
public class AdminRoleDO extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;						                // 自增长主键
    @Column(name = "number")
    private int num;                 //编号
    @Column(name = "role")
    private String role;             //角色

}
