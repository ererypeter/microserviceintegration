package com.registrationcenter.service;

import com.registrationcenter.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Wangxy on 2018/1/31..
 *
 * @author wangxy
 */
public interface UserService {

    User findUserById(Integer userId);
}
