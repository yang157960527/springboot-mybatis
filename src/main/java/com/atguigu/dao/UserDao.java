package com.atguigu.dao;

import com.atguigu.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
