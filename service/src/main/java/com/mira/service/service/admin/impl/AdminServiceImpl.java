package com.mira.service.service.admin.impl;

import com.mira.service.entity.admin.AdminDO;
import com.mira.service.repository.admin.AdminRepository;
import com.mira.service.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public void save(AdminDO admin) {
        adminRepository.save(admin);
    }

    @Override
    public AdminDO findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}
