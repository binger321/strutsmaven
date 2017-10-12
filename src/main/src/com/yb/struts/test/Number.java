package com.yb.struts.test;

public enum Number {
    ONE("Ҽ",1),TWO("��",2),THREE("��",3),FOUR("��",4),FIVE("��",5),SIX("½",6),SEVEN("��",7),ERGHT("��",8),NINE("��",9),ZERO("��",0);
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
