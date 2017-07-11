package com.freedream.service.interfaces;

import com.freedream.domain.User;

/**
 * Created by 陈龙飚 on 2017/7/11 0011.
 */
public interface UserService {
    User selectUserByName(String name);

    /**
     * 注册用户
     * @param user
     * @return
     * @throws Exception
     */
    String signUp(User user) throws Exception;
}
