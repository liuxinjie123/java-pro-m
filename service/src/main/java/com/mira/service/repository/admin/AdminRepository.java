package com.mira.service.repository.admin;


import com.mira.service.entity.admin.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

    AdminEntity findByUsername(String username);
}
