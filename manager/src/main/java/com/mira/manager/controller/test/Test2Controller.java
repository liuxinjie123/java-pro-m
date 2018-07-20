package com.mira.manager.controller.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test2")
@CrossOrigin(origins = "/*", maxAge = 3600)
@Api(tags = {"api-test"}, description = "测试接口")
@RestController
public class Test2Controller {

    @ApiOperation(value = "TEST2-value", notes = "TEST2-notes")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "string", paramType = "path")
    @GetMapping(value = "/{id}")
    public String getUserById(@PathVariable(value = "id") String id) {
        return "this is: " + id;
    }
}
