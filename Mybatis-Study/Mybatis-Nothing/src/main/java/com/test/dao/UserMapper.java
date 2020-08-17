package com.test.dao;

import com.test.pojo.User;

import java.util.List;

/**
 * @Author cbjun
 * @create 2020/8/17 15:30
 */
public interface UserMapper {

    List<User> findUser();

    User getUserById(Integer id);
}
