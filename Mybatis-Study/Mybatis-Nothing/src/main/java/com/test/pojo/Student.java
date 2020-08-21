package com.test.pojo;

import lombok.Data;

/**
 * @Author cbjun
 * @create 2020/8/21 11:07
 */
@Data
public class Student {

    private Integer id;

    private String name;

    private Teacher teacher;
}
