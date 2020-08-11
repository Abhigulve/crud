package com.crud.crud.dao;

import com.crud.crud.model.User;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class Writer {
    Set<User> users = new HashSet<>();

    public boolean saveUser(User user) {
        users.add(user);
        return true;
    }
}
