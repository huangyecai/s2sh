package com.hyc.ssh.service;

import com.hyc.ssh.entity.User;

public interface UserService {
    User getUser(String uid);

    void saveUser(User user);
}
