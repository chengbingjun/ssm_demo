package com.test.dao;

import com.test.pojo.Student;
import com.test.vo.StudentVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author cbjun
 * @create 2020/8/21 11:08
 */
public interface StudentMapper {
    //多对一
    List<Student> getStudent01();

    @Select("SELECT s.id,s.name,t.id as tId ,t.name as tName from student s LEFT JOIN teacher t on s.tid = t.id;")
    List<StudentVo> getStudent02();

    List<StudentVo> getStudent03();
}
