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
            case 10:return "ЪА";
            case 100:return "Ал";
            case 1000:return "ЧЊ";
            case 10000:return "Эђ";
            case 100000:return "ЪА";
            case 1000000:return "Ал";
            case 10000000:return "ЧЊ";
            case 100000000:return "вк";
        }
        return "";
    }
}