package com.yb.struts.test;

public class Number {
    public static String getNameByIndex(int index){
        switch (index){
            case 1:return "Ò¼";
            case 2:return "·¡";
            case 3:return "Èş";
            case 4:return "ËÁ";
            case 5:return "Îé";
            case 6:return "Â½";
            case 7:return "Æâ";
            case 8:return "°Æ";
            case 9:return "¾Á";
            case 0:return "Áã";
        }
        return "";
    }
}
