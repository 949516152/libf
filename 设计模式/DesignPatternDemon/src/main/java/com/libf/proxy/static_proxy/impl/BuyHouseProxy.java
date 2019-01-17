package com.libf.proxy.static_proxy.impl;

import com.libf.proxy.static_proxy.interfaceClass.BuyHouse;

/***
 * 描述：静态代理--代理类
 */
public class BuyHouseProxy implements BuyHouse {
    private BuyHouse buy;

    public BuyHouseProxy(BuyHouse buy) {
        this.buy = buy;
    }

    @Override
    public void byHouse() {
        System.out.println("买房准备中...");
        buy.byHouse();
        System.out.println("已买完房");
    }
}
