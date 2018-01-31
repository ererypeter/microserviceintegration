package com.registrationcenter.controller;

import com.netflix.discovery.converters.Auto;
import com.registrationcenter.model.User;
import com.registrationcenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Wangxy on 2018/1/31..
 *
 * @author wangxy
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("findById")
    public User findById(@RequestParam Integer userId){
        User user=userService.findUserById(userId);
//        User user=ne w User();
        return user;
    }


}
