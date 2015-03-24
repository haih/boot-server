package com.haih.service.impl;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.haih.dao.IUserDao;
import com.haih.pojo.User;
import com.haih.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
    
    private static Logger LOG = Logger.getLogger(UserServiceImpl.class);
    
    @Resource
    private IUserDao userDao;
    
    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
