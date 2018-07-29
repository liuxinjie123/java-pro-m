package com.mira.manager.controller.admin;

import com.mira.common.vo.Constants;
import com.mira.common.vo.Result;
import com.mira.service.entity.admin.AdminDO;
import com.mira.service.service.admin.AdminService;
import com.mira.service.utils.SecureUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@Api(tags = {"api-admin"}, description = "管理员相关接口")
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/test")
    public Result test() {
        AdminDO admin = new AdminDO();
        admin.setUsername("sadmin");
        admin.setSalt("111111");
        admin.setPassword(SecureUtil.securePassword("123321" + admin.getSalt()));
        admin.setName("超级管理员");
        admin.setNumber("000001");
        admin.setRoleId(Constants.ADMIN_ROLE.SUPER_ADMIN.num);
        admin.setRoleName(Constants.ADMIN_ROLE.SUPER_ADMIN.name);
        admin.setStatus(1);
        adminService.save(admin);
        return Result.success();
    }
}
