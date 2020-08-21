package com.test.dao;

import com.test.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author cbjun
 * @create 2020/8/21 11:08
 */
public interface TeacherMapper {

    @Select("select * from teacher where id = #{id}")
    Teacher getTeacher01(@Param("id") Integer id);

    //一对多
    Teacher getTeacher02(@Param("id") Integer id);

    List<Teacher> getTeacher03();
}
