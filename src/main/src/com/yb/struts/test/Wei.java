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
    S("ʮ",10),B("��",100),Q("ǧ",1000);
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
            case 10:return "ʮ";
            case 100:return "��";
            case 1000:return "ǧ";
        }
        return "";
    }
}