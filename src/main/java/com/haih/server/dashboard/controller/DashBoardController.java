package com.haih.server.dashboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haih.server.common.interceptor.LoginInterceptor;
import com.haih.server.dashboard.vo.User;

@Controller
public class DashBoardController {

	private static Logger LOG = LoggerFactory.getLogger(LoginInterceptor.class);
	
	@ResponseBody
	@GetMapping("/dashboard1")
	public String dashboard() {
		
		LOG.info("dashboard begin!");
		User user = new User();
		user.setAge(10);
		user.setName("haih");
		user.setUserId("userId");
		return "main";
	}
}
