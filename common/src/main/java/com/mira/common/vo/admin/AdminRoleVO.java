package com.mira.common.vo.admin;

import com.mira.common.vo.BaseVO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AdminRoleVO extends BaseVO implements Serializable {
    private Long id;				 // 自增长主键
    private int num;                 // 编号
    private String role;             // 角色
}
