package com.libf.responsechain.myinterface;

import com.libf.responsechain.CEO;
import com.libf.responsechain.Manager;
import com.libf.responsechain.Sales;

/***
 * 描述:该类用于封装设置前驱与后继者的关系
 */
public class PriceHandleFactory {
    public static PriceHandle createPriceHandle() {
//        设置前驱与继任者
        PriceHandle sales = new Sales();
        PriceHandle manager = new Manager();
        PriceHandle ceo = new CEO();

        sales.setPriceHandle(manager);
        manager.setPriceHandle(ceo);

        return sales;
    }
}