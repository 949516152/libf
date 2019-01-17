package com.libf.proxy.static_proxy.impl;

import com.libf.proxy.static_proxy.interfaceClass.BuyHouse;

public class TestDemon {

    public static void main(String[] args) {
        BuyHouse buyHouseImpl = new BuyHouseImpl();
        buyHouseImpl.byHouse();
        System.out.println("=======================");
        BuyHouse buyHouseProxy = new BuyHouseProxy(buyHouseImpl);
        buyHouseProxy.byHouse();;
    }
}
