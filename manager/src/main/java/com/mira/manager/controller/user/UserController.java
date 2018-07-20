package com.mira.manager.controller.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/mg/user")
@Api(tags = {"api-user"}, description = "用户相关接口")
@RestController
public class UserController {

    @ApiOperation(value = "TEST-value", notes = "TEST-notes")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "string", paramType = "path")
    @GetMapping(value = "/{id}")
    public String getUserInfoByUserId(@PathVariable(value = "id") String id) {
        return " the userId is: " + id;
    }

}
