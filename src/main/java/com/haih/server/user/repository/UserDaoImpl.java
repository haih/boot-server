package com.haih.server.user.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haih.server.user.repository.mapper.UserMapper;
import com.haih.server.user.repository.po.UserPO;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserPO> loadUser() throws Exception {
		List<UserPO> userList = userMapper.getAllUserList();
		return userList;
	}
}
