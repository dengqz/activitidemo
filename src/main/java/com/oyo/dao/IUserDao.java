package com.oyo.dao;


import com.oyo.model.User;

public interface IUserDao {

    User selectUser(long id);

}