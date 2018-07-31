package com.mira.manager.controller.admin;

import com.mira.common.dto.admin.AdminDTO;
import com.mira.common.dto.admin.AdminRoleDTO;
import com.mira.common.vo.Result;
import com.mira.common.vo.admin.AdminRoleVO;
import com.mira.service.service.admin.AdminRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/admin/role")
@Api(tags = {"api-admin"}, description = "管理员角色相关接口")
@RestController
public class AdminRoleController {
    @Autowired
    private AdminRoleService adminRoleService;

    @GetMapping
    @ApiOperation(value = "查询管理员角色列表", notes = "查询管理员列表-包含所有角色", response = AdminDTO.class, responseContainer = "List")
    public Result getAdminRoleList() {
        List<AdminRoleDTO> adminRoleDTOList = adminRoleService.list();
        List<AdminRoleVO> adminRoleList = new ArrayList<>();
        BeanUtils.copyProperties(adminRoleDTOList, adminRoleList);
        return Result.success().setData(adminRoleList);
    }
}
