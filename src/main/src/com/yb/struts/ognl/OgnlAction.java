package com.yb.struts.ognl;

import com.yb.struts.bean.Address;
import com.yb.struts.bean.User;

import java.util.ArrayList;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/11
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class OgnlAction {
    private Address address;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String set(){
        return SUCCESS;
    }

    public String toShowView(){
        users=new ArrayList<User>();
        for (int i=0;i<=7;i++){
            User user=new User();
            user.setId(1+i);
            user.setAge(20+i);
            user.setName("tom"+i);
            users.add(user);
        }
        return "toShowView";
    }

    public String sayHello(String str){
        return ("sayHello "+str);
    }
}