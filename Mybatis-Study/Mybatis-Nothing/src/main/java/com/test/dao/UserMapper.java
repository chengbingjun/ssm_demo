package com.test.dao;

import com.test.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @Author cbjun
 * @create 2020/8/17 15:30
 */
public interface UserMapper {

    List<User> findUser();

    User getUserById(Integer id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
    //使用map代替实体类或者多个入参的情况
    void addUserByMap(Map<String,Object> map);

    List<User> findUserByNameLike(String name);
}
