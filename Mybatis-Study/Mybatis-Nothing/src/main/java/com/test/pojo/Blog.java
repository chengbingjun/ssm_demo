package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author cbjun
 * @create 2020/8/24 10:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private Integer id;

    private String title;

    private String author;

    private Date createTime;

    private Integer views;
}
