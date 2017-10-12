package com.yb.struts.test;

public enum Number {
    ONE("Ò¼",1),TWO("·¡",2),THREE("Èþ",3),FOUR("ËÁ",4),FIVE("Îé",5),SIX("Â½",6),SEVEN("Æâ",7),ERGHT("°Æ",8),NINE("¾Á",9),ZERO("Áã",0);
    private String name;
    private int index;

    Number(String name, int index) {
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
        switch (index){
            case 1:return "Ò¼";
            case 2:return "·¡";
            case 3:return "Èþ";
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
