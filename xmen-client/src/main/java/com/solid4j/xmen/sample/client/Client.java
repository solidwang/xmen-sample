/*
 * Copyright (c) 2017 solidwang. All Rights Reserved
 */
package com.solid4j.xmen.sample.client;

import com.solid4j.xmen.config.spring.ServiceConfigBean;
import com.solid4j.xmen.sample.model.User;
import com.solid4j.xmen.sample.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author: solidwang
 * @since 1.0
 */
public class Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    private UserService userService;

    public void start() {
        List<User> userList = userService.getList();
        for (User user : userList) {
            LOGGER.info("username=" + user.getUsername() + ", password=" + user.getPassword());
        }
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}