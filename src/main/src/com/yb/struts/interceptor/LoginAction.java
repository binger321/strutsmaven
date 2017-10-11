package com.yb.struts.interceptor;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/10
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LoginAction extends ActionSupport implements SessionAware{

    private static final long serialVersionUID = 5235827449214383173L;

    private String name;

//    接受session中的map
    private Map<String,Object> sessionMap;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSession(Map<String, Object> map) {
        this.sessionMap=map;
    }

    public String login(){
        if ("tom".equals(name)){
            sessionMap.put("username",name);
        }else
            return LOGIN;
        return SUCCESS;
    }

    public String toLoginView(){
        return "loginView";
    }
}