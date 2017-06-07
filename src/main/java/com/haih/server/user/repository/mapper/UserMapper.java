package com.haih.server.user.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.haih.server.user.repository.po.UserPO;

@Mapper
public interface UserMapper {
	
	public List<UserPO> getAllUserList();

}
