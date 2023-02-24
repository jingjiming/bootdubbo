package com.css.bootdubbo.consumer.controller;

import com.css.bootdubbo.api.UserService;
import com.css.common.beans.response.JsonResult;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiming.jing on 2023/2/23
 */
@RestController
@RequestMapping("dubbo/service")
public class UserController {

    @DubboReference
    UserService userService;

    @GetMapping("/getById")
    public JsonResult getById() {
        return this.userService.findById(null);
    }

}
