package com.oyo.service.impl;


import com.oyo.dao.IUserDao;
import com.oyo.model.User;
import com.oyo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
