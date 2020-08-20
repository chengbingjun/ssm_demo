package com.test.dao;

import com.test.pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author cbjun
 * @create 2020/8/20 14:27
 */
//使用注解形式开发
public interface DeptMapper {

    @Select("select * from dept")
    List<Dept> findDepts();

    @Select("select * from dept where deptNo = #{id}")
    Dept getDeptById(@Param("id") Integer id);

    @Insert("insert into dept (deptName,dataSource) values (#{deptName},#{dataSource})")
    void addDept(Dept dept);

}
