package com.haih.server.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haih.server.remote.user.UserClient;
import com.haih.server.remote.user.dto.UserDTO;
import com.haih.server.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{

   private static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserClient userClient;
	
	
	@Override
	public UserVO getUser() {
		UserDTO userDTO = userClient.getUser();
		UserVO user = new UserVO();
		LOG.info(user.toString());
		BeanUtils.copyProperties(userDTO, user);
		return user;
	}
}
