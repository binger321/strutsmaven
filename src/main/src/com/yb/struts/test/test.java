package com.yb.struts.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/11
 * Time: 11:07
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class test {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("a","nihao1");
        map.put("b","nihao2");
        map.put("c","nihao3");
        change(map);
        Object o;
        for(Iterator it=map.keySet().iterator();it.hasNext();){
            o=it.next();
            System.out.println(o.toString()+"::"+map.get(o));
        }


        String a="i am a";
        String b="i am b";

        swap(a,b);
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        int num1=1;
        int num2=2;
        swapint(num1,num2);
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num1);

        System.out.println("hello"+-1/0.0);

        int p=22;
        char q=(char)p;
        System.out.println("::"+q);
        System.out.println(--);

    }

    public static void swap(String a,String b){
        String c=a;
        a=b;
        b=c;
    }

    public static void swapint(int a,int b){
        int c=a;
        a=b;
        b=c;
    }

    public static void change(Map map){
        map.put("a","nihaoÐÞ¸Ä");
    }
}