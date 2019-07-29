package com.manning.springrestful.service.impl;

import com.manning.springrestful.bean.User;
import com.manning.springrestful.dao.UserDao;
import com.manning.springrestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * Title: UserServiceImpl
 * Description:
 * 用户操作实现类
 * Version:1.0.0
 * @author ExpanseWong
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag = false;
        try {
            userDao.addUser(user);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag = false;
        try {
            userDao.updateUser(user);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag = false;
        try {
            userDao.delete(id);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);
    }

    @Override
    public List<User> findAll() {
        List<User> result =null;
        try {
            result =userDao.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
