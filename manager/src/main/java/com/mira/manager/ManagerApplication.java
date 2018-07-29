package com.mira.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.mira.manager.*", "com.mira.service.*"})
@EnableJpaRepositories("com.mira.service.repository")
@EntityScan("com.mira.service.entity")
public class ManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner init(AdminService adminService, AdminRoleService adminRoleService) {
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... strings) throws Exception {
//				AdminRoleDO adminRole = adminRoleService.findByNum(Constants.ADMIN_ROLE.SUPER_ADMIN.num);
//				if (adminRole == null) {
//					adminRole.setNum(Constants.ADMIN_ROLE.SUPER_ADMIN.num);
//					adminRole.setRole(Constants.ADMIN_ROLE.SUPER_ADMIN.name);
//					adminRoleService.save(adminRole);
//				}
//				AdminDO admin = adminService.findByUsername("sadmin");
//				if (admin == null) {
//					admin.setUsername("sadmin");
//					admin.setSalt("111111");
//					admin.setPassword(SecureUtil.securePassword("123321" + admin.getSalt()));
//					admin.setName("超级管理员");
//					admin.setNumber("000001");
//					admin.setRoleId(Constants.ADMIN_ROLE.SUPER_ADMIN.num);
//					admin.setRoleName(Constants.ADMIN_ROLE.SUPER_ADMIN.name);
//					admin.setStatus(1);
//					adminService.save(admin);
//				}
//			}
//		};
//	}
}
