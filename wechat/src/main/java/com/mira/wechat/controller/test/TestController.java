package com.mira.wechat.controller.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@Api(tags = {"api-test"}, description = "测试接口")
@RestController
public class TestController {

    @ApiOperation(value = "TEST-value", notes = "TEST-notes")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "string", paramType = "path")
    @GetMapping(value = "/{id}")
    public String getUserById(@PathVariable(value = "id") String id) {
        return "this is: " + id;
    }
}
