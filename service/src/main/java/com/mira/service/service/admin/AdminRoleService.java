package com.mira.service.service.admin;

import com.mira.service.entity.admin.AdminRoleDO;

public interface AdminRoleService {
    void save(AdminRoleDO adminRole);

    AdminRoleDO findByNum(int num);
}
