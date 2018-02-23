package com.vestedu.persist.dao;

import com.vestedu.persist.entity.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    List<User> listUsers();
}
