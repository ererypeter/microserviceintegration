package com.registrationcenter.service.impl;

import com.registrationcenter.model.User;
import com.registrationcenter.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wangxy on 2018/1/31..
 *
 * @author wangxy
 */
@Service("userService")
public class UserServiceImpl implements UserService  {

    private static Map<Integer,User> userMap = new HashMap<Integer, User>(){
        {
            put(1, new User(1, "xiaxuan", 24));
            put(2, new User(2, "bingwen", 24));
        }
    };


    @Override
    public User findUserById(Integer userId){
        return userMap.get(userId);
    }
}
