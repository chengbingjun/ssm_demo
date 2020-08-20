package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author cbjun
 * @create 2020/8/20 14:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer deptNo;

    private String deptName;

    private String dataSource;

    public Dept(String deptName,String dataSource){
        this.deptName = deptName;
        this.dataSource = dataSource;
    }
}
