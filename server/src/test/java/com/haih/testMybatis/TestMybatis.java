package com.haih.testMybatis;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.haih.common.bean.*;
import com.haih.server.service.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//// 表示继承了SpringJUnit4ClassRunner类
//@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class TestMybatis {
	private static Logger LOG = LoggerFactory.getLogger(TestMybatis.class);
	// private ApplicationContext ac = null;

	@Resource
	private IUserService userService = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }
	//@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
		LOG.info("值：" + user.getUserName());
		LOG.info(JSON.toJSONString(user));
	}

	@Test
	public void test2() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 3; i++) {
			User user = new User();
			user.setAge(String.valueOf(i));
			user.setId(String.valueOf(i));
			user.setPassword("123");
			user.setUserName("haihu" + i);
			users.add(user);
		}
		//userService.insertUsers(users);
	}
}
