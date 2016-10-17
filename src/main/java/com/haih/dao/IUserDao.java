package com.haih.dao;


import com.haih.model.UserOld;


public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOld record);

    int insertSelective(UserOld record);

    UserOld selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserOld record);

    int updateByPrimaryKey(UserOld record);
}
