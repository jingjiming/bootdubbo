package com.css.bootdubbo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.css.bootdubbo.api.HelloService;
import com.css.bootdubbo.api.UserService;
import com.css.bootdubbo.entity.User;
import com.css.bootdubbo.mapper.UserMapper;
import com.css.common.beans.response.JsonResult;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author jiming.jing
 * @since 2023/02/01
 */
@DubboService
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    HelloService helloService;

    @Override
    public JsonResult<User> findById(String id) {
        User user = new User();
        user.setUserId("1");
        user.setUserName("张三" + this.helloService.sayHello());
        return JsonResult.ok().data(user);
    }
}
