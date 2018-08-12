package com.wangdl.spring.service.impl;

import com.wangdl.spring.mapper.IUserDao;
import com.wangdl.spring.model.User;
import com.wangdl.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: //TODO(简略描述这个类的作用)
 * Author: WangDL
 * Date: 2018-08-12 18:19
 * Copyright (c) 2018, ewell.com All Rights Reserved.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao userDao;

    @Override
    public User getUserById(int i) {
        User  user=  userDao.getUserById(i);
        return user;
    }
}
