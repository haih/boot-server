package com.haih.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haih.pojo.User;
import com.haih.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    
    @RequestMapping("/show")
    public String Index(HttpServletRequest request,Model model){
        int userId = Integer.valueOf(request.getParameter("id"));
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "show";
    }
}
