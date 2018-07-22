package com.mira.service.repository.user;


import com.mira.service.entity.user.ManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ManagerEntity, Long> {

    ManagerEntity findByUsername(String username);
}
