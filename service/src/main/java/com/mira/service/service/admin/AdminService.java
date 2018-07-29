package com.mira.service.service.admin;

import com.mira.service.entity.admin.AdminDO;

public interface AdminService {
    void save(AdminDO admin);

    AdminDO findByUsername(String username);
}
