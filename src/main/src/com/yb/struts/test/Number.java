package com.yb.struts.test;

public class Number {
    public static String getNameByIndex(int index){
        switch (index){
            case 1:return "Ҽ";
            case 2:return "��";
            case 3:return "��";
            case 4:return "��";
            case 5:return "��";
            case 6:return "½";
            case 7:return "��";
            case 8:return "��";
            case 9:return "��";
            case 0:return "��";
        }
        return "";
    }
}
