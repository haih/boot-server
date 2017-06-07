package com.haih.server.user.repository;

import java.util.List;

import com.haih.server.user.repository.po.UserPO;

public interface UserDao {

	public List<UserPO> loadUser() throws Exception;
	
}
