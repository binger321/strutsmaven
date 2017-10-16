package com.yb.struts.bean;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/9/27
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class User {
    private String name;
    private Integer age;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}