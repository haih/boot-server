package com.haih.server.user;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import com.haih.server.Application;
import com.haih.server.remote.user.UserClient;
import com.haih.server.user.repository.mapper.UserMapper;
import com.haih.server.user.repository.po.UserPO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = Application.class)
public class ApplicationTests {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserClient userClient;

	//@Test
	public void findByName() throws Exception {
		List<UserPO> pos = userMapper.getAllUserList();
		System.out.println("++++++++"+pos.size());
		Assert.assertEquals(3, pos.size());
	}
	
	@Test
	public void getUser() {
		String userInfo = userClient.getUser();
		System.out.println(userInfo);
	}
}
