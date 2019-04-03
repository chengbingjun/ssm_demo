package com.nf147.oukele.controller;

import com.nf147.oukele.entity.User;
import com.nf147.oukele.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ModelAndView login(User user){
        ModelAndView mv = new ModelAndView();
        if(loginService.canLogin(user)){
            mv.setViewName("success");
        }else{
            mv.setViewName("fail");
        }
        return mv;
    }

}
