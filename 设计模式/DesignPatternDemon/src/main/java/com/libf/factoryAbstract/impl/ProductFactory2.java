package com.libf.factoryAbstract.impl;

import com.libf.factoryAbstract.interfaces.IProduct1;
import com.libf.factoryAbstract.interfaces.IProduct2;
import com.libf.factoryAbstract.interfaces.ProductFactory;

public class ProductFactory2 implements ProductFactory {

    public static final String PRODUCT1 = "1";
    public static final String PRODUCT2 = "2";

    @Override
    public IProduct1 getProduct1(String productType) {
        return null;
    }

    @Override
    public IProduct2 getProduct2(String productType) {
        switch (productType){
            case PRODUCT1:
                return new Product1();

            case PRODUCT2:
                return new Product2();
        }
        return null;
    }
}
