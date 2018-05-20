package com.hyc.ssh.dao;

import com.hyc.ssh.entity.User;

public interface UserDao {
    User getUser(String uid);

    void saveUser(User user);
}
