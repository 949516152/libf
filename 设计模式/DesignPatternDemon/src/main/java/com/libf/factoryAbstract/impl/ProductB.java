package com.libf.factoryAbstract.impl;

import com.libf.factoryAbstract.interfaces.IProduct1;

public class ProductB extends IProduct1 {
    @Override
    public void getProduct() {
        System.out.println(name+"生产B产品");
    }
}
