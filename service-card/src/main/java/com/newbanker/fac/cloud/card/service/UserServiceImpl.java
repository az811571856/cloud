package com.newbanker.fac.cloud.card.service;

import com.newbanker.fac.cloud.card.api.UserService;
import com.newbanker.fac.cloud.card.config.DemoConfig;
import com.newbanker.fac.cloud.card.model.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    DemoConfig config;

    @Override
    public UserDTO findUser(Integer userId) {
        UserDTO user = new UserDTO();
        user.setUserId(userId);
        user.setUserName("菩提树下的杨过(" + config.getTitle() + ")");
        return user;
    }
}
