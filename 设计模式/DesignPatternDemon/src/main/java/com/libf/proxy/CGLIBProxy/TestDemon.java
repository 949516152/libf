package com.libf.proxy.CGLIBProxy;

public class TestDemon {
    public static void main(String[] args) {

//        实现了接口形式
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();

        BuyHouse buyHouse1 = (BuyHouse) cglibProxy.getInstance(buyHouse);

        buyHouse1.buyHouse();

        System.out.println("====================");

//      以上是有实现接口，以下是没有实现接口的形式
        SaleHouse saleHouse = new SaleHouse();

        SaleHouse house = (SaleHouse) cglibProxy.getInstance(saleHouse);

        house.saleHouse();
    }
}
