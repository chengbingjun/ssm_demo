package com.cbj.pojo;

import lombok.Data;

/**
 * @Author cbjun
 * @create 2020/8/17 15:27
 */
@Data
public class User {

    private Integer id;

    private String name;

    private String password;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
}
