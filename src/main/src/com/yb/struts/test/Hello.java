package com.yb.struts.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
//            int num=4035;
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


        }
    }

    public static void quLin(ArrayList a){
        for(int i=0;i<a.size();i++){
            if ("Áã".equals(a.get(i))&&i)
        }
    }
}