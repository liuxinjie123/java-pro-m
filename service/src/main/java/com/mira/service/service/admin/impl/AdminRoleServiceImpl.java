package com.mira.service.service.admin.impl;

import com.mira.common.dto.admin.AdminRoleDTO;
import com.mira.service.entity.admin.AdminRoleDO;
import com.mira.service.repository.admin.AdminRoleRepository;
import com.mira.service.service.admin.AdminRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminRoleServiceImpl implements AdminRoleService {
    @Autowired
    private AdminRoleRepository adminRoleRepository;

    @Override
    public void save(AdminRoleDTO adminRole) {
        AdminRoleDO adminRoleDO = new AdminRoleDO();
        BeanUtils.copyProperties(adminRole, adminRoleDO);
        adminRoleRepository.save(adminRoleDO);
    }

    @Override
    public AdminRoleDTO findByNum(int num) {
        AdminRoleDO adminRoleDO = adminRoleRepository.findByNum(num);
        System.out.println(" ------ adminRoleDO=" + adminRoleDO.toString());
        AdminRoleDTO adminRole = new AdminRoleDTO();
        BeanUtils.copyProperties(adminRoleDO, adminRole);
        System.out.println(" ------ adminRoleDO=" + adminRole.toString());
        return adminRole;
    }

    @Override
    public List<AdminRoleDTO> list() {
        List<AdminRoleDO> adminRoleDOList = adminRoleRepository.findAll();
        List<AdminRoleDTO> adminRoleList = new ArrayList<>();
        for (AdminRoleDO adminRoleDO : adminRoleDOList) {
            AdminRoleDTO adminRole = new AdminRoleDTO();
            BeanUtils.copyProperties(adminRoleDO, adminRole);
            adminRoleList.add(adminRole);
        }
        System.out.println("size1=" + adminRoleDOList.size());
        System.out.println("size2=" + adminRoleList.size());
        return adminRoleList;
    }
}
