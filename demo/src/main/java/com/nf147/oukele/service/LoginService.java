package com.nf147.oukele.service;

import com.nf147.oukele.entity.User;

public interface LoginService {
    boolean canLogin(User user);
}
