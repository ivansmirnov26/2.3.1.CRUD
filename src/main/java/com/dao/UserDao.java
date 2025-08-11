package com.dao;

import com.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();

    void add(User user);

    void delete(Integer id);

    void edit(User user);

    User getById(Integer id);
}
