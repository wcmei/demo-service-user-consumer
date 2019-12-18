package com.wcmei.demo.service.user.consumer.controller;

import com.wcmei.demo.commons.dto.BaseResult;
import com.wcmei.demo.service.user.api.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wcmei
 * @date 2019-12-16
 * @description
 */
@Api(description = "测试接口")
@RestController
@RequestMapping("/test")
public class UserController {

    @Reference(version = "1.0.0", protocol = "dubbo")
    private UserService jpaUserService;

    @Reference(version = "2.0.0", protocol = "dubbo")
    private UserService tkUserService;

    @PostMapping("/one")
    @ApiOperation("测试一")
    public BaseResult one() {
        return BaseResult.success(jpaUserService.Test());
    }

    @PostMapping("/two")
    @ApiOperation("测试二")
    public BaseResult two() {
        return BaseResult.success(tkUserService.Test());
    }
}
