/*
 * Copyright (c) 2017 solidwang. All Rights Reserved
 */
package com.solid4j.xmen.sample.service.impl;

import com.solid4j.xmen.sample.model.User;
import com.solid4j.xmen.sample.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: solidwang
 * @since 1.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getList() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User("username-" + i, "password-" + i);
            userList.add(user);
        }
        return userList;
    }
}