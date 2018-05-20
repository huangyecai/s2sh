package com.hyc.ssh.service;

import com.hyc.ssh.dao.UserDao;
import com.hyc.ssh.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    //依赖Dao
    @Resource
    private UserDao userDao;
    // 注入事务管理
    @Transactional(rollbackFor={Exception.class, RuntimeException.class})
    public User getUser(String uid) {
        return userDao.getUser(uid);
    }

    @Transactional(rollbackFor={Exception.class, RuntimeException.class})
    public void saveUser(User user) {
        userDao.saveUser(user);
//        throw new RuntimeException();
//        userDao.saveUser(user);
    }
}