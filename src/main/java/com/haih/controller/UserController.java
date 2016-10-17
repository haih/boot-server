package com.haih.controller;


import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haih.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
    private static Logger LOG = LoggerFactory.getLogger(UserController.class);
   
    private HashMap<String, User> userList = new HashMap<>();
    
    public UserController() {
    	for (int i = 0; i < 3; i++) {
			userList.put("001", new User("001","haihu","123"));
			userList.put("002", new User("002","haihu","123"));
			userList.put("003", new User("003","haihu","123"));
    	}
	}
	
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String id,String password,HttpServletRequest request, Model model){
    	LOG.info("Login begin!");
    	if (userList.containsKey(id)) {
    		model.addAttribute("user", userList);
    		return "show";
		}
    	return "error";
    }
    
    @RequestMapping(value = "/{id}/info")
    public String showUser(@PathVariable String id,HttpSession session,Model model){
    	LOG.info("showUser begin!");
    	model.addAttribute("user", userList.get(id));
        return "showInfo";
    }
    
    @RequestMapping(value = "/showList")
    public String showList(HttpServletRequest request,Model model){
    	LOG.info("showList begin!");
    	User user = (User)request.getSession().getAttribute("user");
    	if(user == null) {
    		return "error";
    	}
    	LOG.info(user.getUserName());
    	model.addAttribute("user", userList);
        return "show";
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable String id){
        userList.remove(id);
        return "redirect:/user/showList";
    }
    
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(String responseData){
        //User user = new User.Builder(1, "hh","3424145",23).build();
        //userService.insertUser(user);
    	System.out.println(responseData);
        return "OK";
    }
}
