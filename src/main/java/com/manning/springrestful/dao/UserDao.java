package com.manning.springrestful.dao;

import com.manning.springrestful.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * @author ExpanseWong
 */
@SuppressWarnings("unused")
@Mapper
public interface UserDao {

    /**
     *  添加数据
     *
     * @param user 单个用户信息
     */
    @Insert("insert into t_user(id,name,age) values(#{id},#{name},#{age})")
    void addUser(User user);

    /**
     * 修改用户数据
     *
     * @param user 单个用户信息
     */
    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);

    /**
     * 根据id删除用户信息
     *
     * @param id 用户id
     */
    @Delete("delete from t_user where id=#{id}")
    void delete(int id);

    /**
     * 根据用户姓名查找用户信息
     *
     * @param userName 用户名
     * @return 单个用户信息
     */
    @Select("select id ,name,age from t_user where user=#{userName}")
    User findByName(@Param("userName") String userName);

    /**
     * 查询所有用户信息
     *
     * @return 用户信息集合
     */
    @Select("select id,name,age from t_user")
    List<User> findAll();

}
