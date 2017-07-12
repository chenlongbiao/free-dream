package com.freedream.controller;

import com.freedream.domain.User;
import com.freedream.service.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 陈龙飚 on 2017/7/11 0011.
 */
@RestController
public class UserController {

    private final  Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    /**
     * 根据姓名查询用户
     */
    @RequestMapping(value = "queryUser")
    public User queryUser(String name) {
        //调用service层
        System.out.println(name);
        User user = userService.selectUserByName(name);
        return user;
    }

    /**
     * 注册用户
     * @param user 接收user对象
     * @param
     * @return 0  失败   1   成功
     */
    @CrossOrigin
    @RequestMapping(value = "signUp")
    public Map<String,String> signUp(@RequestBody User user) {
        logger.info(user+"");
        Map<String, String> map = new HashMap<>();
        String success = "0";
        try {
//            String mobile = (String) request.getAttribute("mobile");
//            String password = (String) request.getAttribute("password");
//            String username = (String) request.getAttribute("username");
//            User user = new User();
//            user.setMobile(mobile);
//            user.setMobile(password);
//            user.setMobile(username);
            success = userService.signUp(user);
//            success="1";
            map.put("success", success);
            logger.info("---------------");
            logger.info("注册用户结果："+success);
            logger.info("---------------");
            return map;
        } catch (Exception e) {
            logger.info("---------------");
            logger.info("注册用户出现异常："+e);
            logger.info("---------------");
            map.put("success", success);
            return map;
        }
    }
}
