package com.mira.service.service.admin.impl;

import com.mira.common.dto.admin.AdminDTO;
import com.mira.common.vo.Page;
import com.mira.service.entity.admin.AdminDO;
import com.mira.service.repository.admin.AdminRepository;
import com.mira.service.service.admin.AdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public void save(AdminDTO admin) {
        AdminDO adminDO = new AdminDO();
        BeanUtils.copyProperties(admin, adminDO);
        adminRepository.save(adminDO);
    }

    @Override
    public AdminDTO findByUsername(String username) {
        AdminDO adminDO = adminRepository.findByUsername(username);
        AdminDTO admin = new AdminDTO();
        BeanUtils.copyProperties(adminDO, admin);
        return admin;
    }

    @Override
    public List<AdminDTO> list(Page page) {
        return null;
    }
}
