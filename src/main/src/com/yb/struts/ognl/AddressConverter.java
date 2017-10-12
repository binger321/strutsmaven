package com.yb.struts.ognl;

import com.yb.struts.bean.Address;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/10/11
 * Time: 16:09
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class AddressConverter extends StrutsTypeConverter {
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        if (strings.length!=0){
            String[] add=strings[0].split("-");
            if (strings[0]!=null&&add.length>2){
                Address address=new Address();
                address.setProvince(add[0]);
                address.setCity(add[1]);
                address.setStreet(add[2]);
                return address;
            }
        }
        return null;
    }

    public String convertToString(Map map, Object o) {
        if (o instanceof Address){
            return o.toString();
        }
        return null;
    }
}