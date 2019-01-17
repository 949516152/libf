package com.libf.proxy.dynamic_proxy.impl;

import com.libf.proxy.dynamic_proxy.interfaceClass.BuyHouse;

import java.lang.reflect.Proxy;

public class TestDemon {
    public static void main(String[] args) {
        BuyHouse buyHouseImpl = new BuyHouseImpl();

        BuyHouse buyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),new Class[]{BuyHouse.class},new DynamicProxyHandler(buyHouseImpl));
        buyHouse.buyHouse();
    }
}
