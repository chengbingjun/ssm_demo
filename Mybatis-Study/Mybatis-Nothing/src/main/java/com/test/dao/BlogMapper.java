package com.test.dao;

import com.test.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Author cbjun
 * @create 2020/8/24 10:33
 */
public interface BlogMapper {

    //动态sql(if、where标签）
    List<Blog> getBlogByIF(Map map);
    //动态sql(choose、when标签）类似switch-case
    List<Blog> getBlogByChoose(Map map);

}
