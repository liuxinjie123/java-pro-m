package com.mira.manager.controller.admin;

import com.mira.common.dto.admin.AdminDTO;
import com.mira.common.vo.Page;
import com.mira.common.vo.Result;
import com.mira.common.vo.admin.AdminVO;
import com.mira.service.service.admin.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/admin")
@Api(tags = {"api-admin"}, description = "管理员相关接口")
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping
    @ApiOperation(value = "查询管理员列表", notes = "查询管理员列表", response = AdminDTO.class, responseContainer = "List")
    @ApiImplicitParam(name = "page", value = "当前页数", required = false, defaultValue = "1", dataType = "int", paramType = "query")
    public Result getAdminList(@ApiParam(name = "page", value = "分页参数", required = false, defaultValue = "1") Page page) {
        List<AdminDTO> adminDTOList = adminService.list(page);
        List<AdminVO> adminList = new ArrayList<>();
        BeanUtils.copyProperties(adminDTOList, adminList);
        return Result.success().setData(adminList);
    }
}
