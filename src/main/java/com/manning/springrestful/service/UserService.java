package com.manning.springrestful.service;

import com.manning.springrestful.bean.User;

import java.util.List;

/**
 *
 * Title: UserService
 * Description:用户接口
 * Version:1.0.0
 * @author ExpanseWong
 */
public interface UserService {

    /**
     * @param user
     * @return
     */
    boolean addUser(User user);
    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 根据用户名字查询用户信息
     * @param userName
     */
    User findUserByName(String userName);



    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

}
