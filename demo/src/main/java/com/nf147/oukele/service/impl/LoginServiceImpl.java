package com.nf147.oukele.service.impl;

import com.nf147.oukele.dao.UserMapper;
import com.nf147.oukele.entity.User;
import com.nf147.oukele.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean canLogin(User user) {
//        User result = userMapper.selectOne(user);
//        if(StringUtils.isEmpty(result)){
//            return false;
//        }else {
//            return true;
//        }
        return true;
    }
}
