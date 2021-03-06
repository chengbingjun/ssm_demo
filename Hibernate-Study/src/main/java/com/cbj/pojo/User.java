package com.cbj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author cbjun
 * @create 2020/8/17 15:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Integer id;

    private String name;

    private String password;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
}
