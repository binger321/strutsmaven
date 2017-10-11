package com.yb.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.yb.struts.action.RegistAction;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/10
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LoginInterceptor implements Interceptor {
    public void destroy() {

    }

    public void init() {

    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Object action=actionInvocation.getAction();
        if (action instanceof LoginAction||action instanceof RegistAction)
            return actionInvocation.invoke();
        Map<String,Object> sessionMap=actionInvocation.getInvocationContext().getSession();
        //如果没有登录
        if (sessionMap.get("username")!=null)
            return "login";
        //登录了，则放行
        return actionInvocation.invoke();


    }
}