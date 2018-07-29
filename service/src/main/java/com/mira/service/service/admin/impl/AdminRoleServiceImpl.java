package com.mira.service.service.admin.impl;

import com.mira.service.entity.admin.AdminRoleDO;
import com.mira.service.repository.admin.AdminRoleRepository;
import com.mira.service.service.admin.AdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl implements AdminRoleService {
    @Autowired
    private AdminRoleRepository adminRoleRepository;

    @Override
    public void save(AdminRoleDO adminRole) {
        adminRoleRepository.save(adminRole);
    }

    @Override
    public AdminRoleDO findByNum(int num) {
        return adminRoleRepository.findByNum(num);
    }
}
