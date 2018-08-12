package com.wangdl.spring.test;

import com.wangdl.spring.model.User;
import com.wangdl.spring.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description: //TODO(简略描述这个类的作用)
 * Author: WangDL
 * Date: 2018-08-12 18:05
 * Copyright (c) 2018, ewell.com All Rights Reserved.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
public class AppTest {

    @Autowired
    public IUserService userService;

    @Test
    public void getUserByIdTest() {
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
    }

}
