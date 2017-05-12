package com.haih.server.boot;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

	private static Logger LOG = LoggerFactory.getLogger(LoginController.class);
	
	
	public LoginController() {
	}	 
	   
		
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(String id,String password,HttpServletRequest request, Model model){
		LOG.info("Login begin!");
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
