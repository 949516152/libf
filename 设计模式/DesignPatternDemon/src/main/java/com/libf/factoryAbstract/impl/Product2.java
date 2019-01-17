package com.libf.factoryAbstract.impl;

import com.libf.factoryAbstract.interfaces.IProduct2;

public class Product2 implements IProduct2 {
    @Override
    public void getProduct() {
        System.out.println("生产二号产品");
    }
}
