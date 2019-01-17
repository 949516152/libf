package com.libf.factoryAbstract.impl;

import com.libf.factoryAbstract.interfaces.IProduct1;

public class ProductA extends IProduct1 {
    @Override
    public void getProduct() {
        System.out.println(name+"生产A产品");
    }
}
