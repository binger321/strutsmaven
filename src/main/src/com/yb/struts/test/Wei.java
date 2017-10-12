package com.yb.struts.test;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/12
 * Time: 19:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum Wei {
    S("十",10),B("百",100),Q("千",1000);
    private String name;
    private int index;

    Wei(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static String getNameByIndex(int index){
        switch(index){
            case 10:return "十";
            case 100:return "百";
            case 1000:return "千";
        }
        return "";
    }
}