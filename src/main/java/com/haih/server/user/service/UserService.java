package com.haih.server.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haih.server.user.repository.UserDaoImpl;
import com.haih.server.user.repository.po.UserPO;

@Service
public class UserService {

	@Autowired
	UserDaoImpl userDao;
	
	public static void main(String[] args) {
		UserDaoImpl userDao = new UserDaoImpl();
		List<UserPO> userPOs = new ArrayList<>();
		try {
			 userPOs = userDao.loadUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(userPOs.size());
	}
}
