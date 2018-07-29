package com.mira.service.repository.admin;


import com.mira.service.entity.admin.AdminDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminDO, Long> {

    AdminDO findByUsername(String username);
}
