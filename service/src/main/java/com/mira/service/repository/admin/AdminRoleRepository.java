package com.mira.service.repository.admin;

import com.mira.service.entity.admin.AdminRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRoleRepository extends JpaRepository<AdminRoleEntity, Long> {
}
