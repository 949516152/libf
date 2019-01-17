package com.libf.proxy.dynamic_proxy.impl;

import com.libf.proxy.dynamic_proxy.interfaceClass.BuyHouse;

public class BuyHouseImpl implements BuyHouse {
    @Override
    public void buyHouse() {
        System.out.println("动态代理买房子");
    }
}
