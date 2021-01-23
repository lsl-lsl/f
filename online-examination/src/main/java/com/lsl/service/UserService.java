package com.lsl.service;

import com.lsl.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
public interface UserService extends IService<User> {
    User findUserByAccount(int account);
}
