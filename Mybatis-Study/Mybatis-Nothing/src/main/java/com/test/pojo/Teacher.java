package com.test.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author cbjun
 * @create 2020/8/21 11:06
 */
@Data
public class Teacher {

    private Integer id;

    private String name;

    private List<Student> students;
}
