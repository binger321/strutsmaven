package com.yb.struts.token;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/10
 * Time: 16:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TokenAction extends ActionSupport{
    private static final long serialVersionUID = 4930195559253859542L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String reg(){
        System.out.println("reg...");
        return SUCCESS;
    }

    public String toRegView(){
        return "regView";
    }
}