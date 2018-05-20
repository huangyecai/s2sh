package com.hyc.ssh.action;

import com.hyc.ssh.entity.User;
import com.hyc.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {

    //定义存放到值栈中的对象
    private User user;

     //依赖service
    @Resource
    private UserService userService;

    public void setUser(User user) {
        this.user = user;
    }

    //实现要存放到值栈中对象的get方法
    public User getUser() {
        return user;
    }

    public String m1(){
        user =  userService.getUser(getUser().getId());
        System.out.println(user.getName());
        return SUCCESS;
    }

    public String saveUser(){

        userService.saveUser(getUser());

        return SUCCESS;
    }
}