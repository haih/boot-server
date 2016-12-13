package com.haih.server.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haih.common.bean.User;


@Controller
public class LoginController {

	private static Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	private HashMap<String, User> userList = new HashMap<>();
	
	public LoginController() {
		for (int i = 0; i < 3; i++) {
			userList.put("001", new User("001","haihu","123"));
			userList.put("002", new User("002","haihu","123"));
			userList.put("003", new User("003","haihu","123"));
		}
	}	 
	   
		
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(String id,String password,HttpServletRequest request, Model model){
		LOG.info("Login begin!");
		User user = userList.get(id);
		if (userList.containsKey(id)) {
			request.getSession().setAttribute("user", user);
			return "redirect:/user/showList";
		}
		return "error";
	}	 
	  
    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request){
    	String auth = request.getHeader("Authorization");
    	LOG.info("Authorization" + auth );
        //userList.remove(id);
        return "test";
    }
}
