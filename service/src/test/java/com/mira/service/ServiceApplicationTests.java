package com.mira.service;

import com.mira.service.entity.admin.AdminRoleEntity;
import com.mira.service.repository.admin.AdminRoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {
	@Autowired
	private AdminRoleRepository adminRoleRepository;

	@Test
	public void contextLoads() {
		System.out.println(" test ");
		AdminRoleEntity adminRole = new AdminRoleEntity();
		adminRole.setNum(0);
		adminRole.setRole("超级管理员");
		adminRoleRepository.save(adminRole);
	}

}
