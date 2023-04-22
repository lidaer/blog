package com.blog.service;

import com.blog.MyUtils.CheckUtil;
import com.blog.pojo.RegisterUser;
import com.blog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private CheckUtil checkUtil;

    public String registerCheck(RegisterUser registerUser){
        return checkUtil.checkReturnMessage(registerUser);
    }

    public User registerUserTurnToUser(RegisterUser registerUser){
        User user = new User();
        user.setUsername(registerUser.getUsername());
        user.setPassword(registerUser.getPassword());
        user.setEmail(registerUser.getEmail());
        return user;
    }

}
