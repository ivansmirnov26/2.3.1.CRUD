package com.service;

import java.util.List;
import com.model.User;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(Integer id);

    void edit(User user);

    User getById(Integer id);
}