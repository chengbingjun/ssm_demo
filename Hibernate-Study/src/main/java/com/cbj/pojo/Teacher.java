package com.cbj.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @Author cbjun
 * @create 2020/8/21 11:06
 */
@Data
public class Teacher implements Serializable {

    private Integer id;

    private String name;
    @JsonIgnoreProperties("teacher")
    //@JsonBackReference
    private Set<Student> students;
}
