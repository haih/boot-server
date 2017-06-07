package com.haih.server.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.haih.server.service.IUserService;

@Service("userServiceimpl")
public class UserServiceImpl implements IUserService{
    
    private static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
    
}
