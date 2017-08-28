/*
 * Copyright (c) 2017 solidwang. All Rights Reserved
 */
package com.solid4j.xmen.sample.client.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: solidwang
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("demo-referer.xml");
    }
}