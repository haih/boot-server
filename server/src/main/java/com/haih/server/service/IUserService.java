package com.haih.server.service;

import java.util.List;

import com.haih.common.bean.User;


public interface IUserService {
    
   public User getUserById(int userId);
   
   public void insertUsers(List<User> users);
   public void insertUser(User user);
}
