package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author cbjun
 * @create 2020/8/20 10:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {

    private Integer startIndex;

    private Integer pageSize;


}
