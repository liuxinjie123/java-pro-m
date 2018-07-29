package com.mira.service.repository.admin;

import com.mira.service.entity.admin.AdminRoleDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRoleRepository extends JpaRepository<AdminRoleDO, Long> {
    AdminRoleDO findByNum(int num);
}
