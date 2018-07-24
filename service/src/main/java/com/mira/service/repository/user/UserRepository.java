package com.mira.service.repository.user;


import com.mira.service.entity.admin.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AdminEntity, Long> {

    AdminEntity findByUsername(String username);
}
