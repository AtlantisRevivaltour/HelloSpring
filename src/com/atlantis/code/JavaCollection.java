package com.atlantis.code;

import java.util.*;

/**
 * JavaCollection类
 *
 * @author Syusuke
 * @description 请添加描述
 * @date 2016/6/29 0029
 * @time 14:26
 */
public class JavaCollection {

    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProp;

    public List getAddressList() {
        System.out.println("List Elements :" + addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements :" + addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        System.out.println("Map Elements :" + addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProp() {
        System.out.println("Property Elements :" + addressProp);
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }
}
