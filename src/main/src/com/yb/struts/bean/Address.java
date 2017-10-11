package com.yb.struts.bean;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/11
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Address {
    private String province;
    private String city;
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}