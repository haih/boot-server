package com.haih.service;

import java.util.List;

import com.haih.model.UserOld;


public interface IUserService {
    
   public UserOld getUserById(int userId);
   
   public void insertUsers(List<UserOld> users);
   public void insertUser(UserOld user);
}
