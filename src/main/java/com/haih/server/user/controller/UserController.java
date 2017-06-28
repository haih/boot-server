package com.haih.server.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haih.server.user.service.UserService;
import com.haih.server.user.vo.UserVO;

@RestController
public class UserController {
	
	@Autowired
    private UserService userService;

    @GetMapping("/user")
    public UserVO getUserInfo() {
    	return userService.getUser();
    }

}