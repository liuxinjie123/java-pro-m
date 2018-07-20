package com.mira.wechat.controller.user;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/wc/user")
@Api(tags = {"api-user"}, description = "用户相关接口")
@RestController
public class UserController {
}
