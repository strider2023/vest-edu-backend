package com.vestedu.persist.services;

import com.vestedu.persist.entity.User;

import java.util.List;

public interface UserService {

    void add(User user);
    List<User> listUsers();
}
