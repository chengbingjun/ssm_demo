package com.nf147.oukele.dao;

import com.nf147.oukele.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectOne(@Param("user")User user);
}
