package com.mira.service.service.admin;

import com.mira.common.dto.admin.AdminRoleDTO;

import java.util.List;

public interface AdminRoleService {
    void save(AdminRoleDTO adminRole);

    AdminRoleDTO findByNum(int num);

    List<AdminRoleDTO> list();
}
