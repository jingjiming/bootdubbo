package com.css.bootdubbo.api;

import com.css.bootdubbo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.css.common.beans.response.JsonResult;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author jiming.jing
 * @since 2023/02/01
 */
public interface UserService extends IService<User> {

    JsonResult<User> findById(String id);
}
