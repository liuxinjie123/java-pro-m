package com.mira.service.repository.admin;

import com.mira.service.entity.admin.AdminLoginLogDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLoginLogRepository extends JpaRepository<AdminLoginLogDO, Long> {
}
