package com.haih.server.dao;


import javax.annotation.Resource;


import com.haih.common.bean.User;

@Resource
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
