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
        System.out.println("�ɹ�����action���������ڴ���");
        System.out.println("����service");
        System.out.println(name+" : "+age);
        return "success";
    }
}