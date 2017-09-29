package com.yb.struts.action;

import com.yb.struts.bean.User;

/**
 * Created by yb.
 */
public class LoginAction {
    private String name;
    private Integer age;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String success(){
        System.out.println("成功调用action，请求正在处理");
        System.out.println("调用service");
        System.out.println(name+" : "+age);
        return "success";
    }
}