package com.libf.factoryAbstract.impl;

import com.libf.factoryAbstract.interfaces.ProductFactory;

public class FactoryProducer {
    public static final String PRODUCTFIRST = "product1";
    public static final String PRODUCTSECOND = "product2";


    public ProductFactory getFactory(String name){
        switch (name){
            case PRODUCTFIRST:
                return new ProductFactory1();
            case PRODUCTSECOND:
                return new ProductFactory2();
        }

        return null;
    }
}
