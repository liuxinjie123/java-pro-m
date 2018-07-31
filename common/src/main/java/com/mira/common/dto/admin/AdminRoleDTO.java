package com.mira.common.dto.admin;

import com.mira.common.dto.BaseDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AdminRoleDTO extends BaseDTO implements Serializable {
    private Long id;				 // 自增长主键
    private int num;                 // 编号
    private String role;             // 角色
}
