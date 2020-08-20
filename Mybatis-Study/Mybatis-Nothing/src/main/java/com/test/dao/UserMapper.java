package com.test.dao;

import com.test.pojo.Page;
import com.test.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    //模糊查询
    List<User> findUserByNameLike(String name);
    //分页查询
    List<User> findUserByLimit(Page page);
    @Select("select * from user where id = #{id}")
    User getUserByIdTest(@Param("id") Integer id);
}
