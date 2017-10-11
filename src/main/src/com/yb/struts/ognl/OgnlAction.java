package com.yb.struts.ognl;

import com.yb.struts.bean.Address;

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
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String set(){
        return SUCCESS;
    }
}