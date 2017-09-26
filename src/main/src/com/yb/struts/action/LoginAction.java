package com.yb.struts.action;

/**
 * Created by yb.
 */
public class LoginAction {
    public String success(){
        System.out.println("成功调用action，请求正在处理");
        System.out.println("调用service");
        return "success";
    }
}