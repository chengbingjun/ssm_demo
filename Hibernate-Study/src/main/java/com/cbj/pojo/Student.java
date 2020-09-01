package com.cbj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author cbjun
 * @create 2020/8/21 11:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private Integer id;

    private String name;
    @JsonIgnoreProperties("students")
    private Teacher teacher;

}
