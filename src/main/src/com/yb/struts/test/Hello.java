package com.yb.struts.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/12
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Hello {
    public static void main(String[] args) throws IOException {
        while(true){
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str=br.readLine();
            int len=str.length();
            int num=Integer.parseInt(str);
            ArrayList<String> result=new ArrayList<String>();
//            int num=5096;
//            int len=4;
            for (int i=0;i<len-1;i++){
                int weishu=(int)Math.pow(10,len-i-1);
                int a= (int) (num/weishu);
                num=num-a*weishu;
                String shuzi=Number.getNameByIndex(a);
//                System.out.print(shuzi);
                result.add(shuzi);
                if(a==0)
                    continue;
                String b=Wei.getNameByIndex(weishu);
//                System.out.print(b);
                result.add(b);
            }
            String c=Number.getNameByIndex(num);
//            System.out.println(c);
            result.add(c);

//        System.out.println(Arrays.toString(result.toArray()));
        ArrayList<String> t=quLin(result);

        for (String str1:t){
            System.out.print(str1);
        }
            System.out.println("");
//        System.out.println(Arrays.toString(t.toArray()));

        }
    }

    public static ArrayList quLin(ArrayList a){
        if (a.size()==0){
            a.add("¡„");
            return a;
        }
        int tag=0;
        if ("¡„".equals(a.get(0))){
            a.remove(0);
//            System.out.println(Arrays.toString(a.toArray()));
            return quLin(a);
        }
        for(int i=0;i<a.size();i++){
            if("¡„".equals(a.get(i))){
                if (tag!=0){
                    if((i-tag)==1){
                        a.remove(i);
                        return quLin(a);
                    }else
                        tag=i;
                }else
                    tag=i;
            }
        }
        if ("¡„".equals(a.get(a.size()-1)))
            a.remove(a.size()-1);
        return a;
    }
}