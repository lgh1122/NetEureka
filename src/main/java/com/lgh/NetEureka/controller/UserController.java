package com.lgh.NetEureka.controller;

import com.lgh.NetEureka.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping("/user")
    @ResponseBody
    public User sayHello(){
        final User user = new User();
        user.setName("李四");
        return user;
    }


}
