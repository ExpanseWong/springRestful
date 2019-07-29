package com.manning.springrestful.controller;

import com.manning.springrestful.bean.User;
import com.manning.springrestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Title: UserRestController
 * Description:
 * 用户数据操作接口
 * Version:1.0.0
 *
 * @author ExpanseWong
 */
@RestController
@RequestMapping("/api/user")
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user) {
        System.out.println("开始新增...");
        System.out.println("User:"+user.toString());
        return userService.addUser(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public boolean updateUser(@RequestBody User user) {
        System.out.println("开始更新...");
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "userId") int userId) {
        System.out.println("开始删除...");
        return userService.deleteUser(userId);
    }


    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public User findByUserName(@RequestParam(value = "userName") String userName) {
        System.out.println("开始查询...");
        return userService.findUserByName(userName);
    }


    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> findByUserAge() {
        System.out.println("开始查询所有数据...");
        return userService.findAll();
    }


}
