package com.yb.struts.test;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/12
 * Time: 19:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Wei {
    public static String getNameByIndex(int index){
        switch(index){
            case 10:return "ʰ";
            case 100:return "��";
            case 1000:return "Ǫ";
            case 10000:return "��";
            case 100000:return "ʰ";
            case 1000000:return "��";
            case 10000000:return "Ǫ";
            case 100000000:return "��";
        }
        return "";
    }
}