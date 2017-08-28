/*
 * Copyright (c) 2017 Sohu. All Rights Reserved
 */
package com.solid4j.xmen.sample.controller;

import com.solid4j.xmen.sample.model.User;
import com.solid4j.xmen.sample.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: solidwang
 * @since 1.0
 */
@Controller
public class SampleController {

    @Resource
    private UserService userService;

    @RequestMapping("/helloworld")
    public String hello(Model model) {
        List<User> userList = userService.getList();
        model.addAttribute("userList", userList);
        return "user";
    }
}