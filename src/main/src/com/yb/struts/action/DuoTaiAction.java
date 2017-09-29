package com.yb.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/9/27
 * Time: 9:56
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class DuoTaiAction extends ActionSupport{

    public String update(){
        System.out.println("update");
        return "update";
    }

    public String execute(){
        System.out.println("execute");
        return "success";
    }
    public String save(){
        System.out.println("save");
        return "save";
    }
    public String delete(){
        System.out.println("delete");
        return "success";
    }
    public String select(){
        System.out.println("select");
        return "success";
    }
    public String sayHello(){
        System.out.println("Hello");
        return "success";
    }
}