package com.css.bootdubbo.service.impl;

import com.css.bootdubbo.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * Created by jiming.jing on 2023/2/23
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello Dubbo!";
    }
}
