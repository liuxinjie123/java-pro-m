package com.mira.service.repository.admin;

import com.mira.service.entity.admin.AdminLoginLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminLoginLogRepository extends JpaRepository<AdminLoginLogEntity, Long> {
}
