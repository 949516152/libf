package com.libf.factoryAbstract.impl;

import com.libf.factoryAbstract.interfaces.IProduct1;
import com.libf.factoryAbstract.interfaces.IProduct2;
import com.libf.factoryAbstract.interfaces.ProductFactory;

public class ProductFactory1 implements ProductFactory {

    public static final String PRODUCTA = "A";
    public static final String PRODUCTB = "B";

    @Override
    public IProduct1 getProduct1(String productType) {
        switch (productType){
            case PRODUCTA:
                return new ProductA();

            case PRODUCTB:
                return new ProductB();
        }
        return null;
    }

    @Override
    public IProduct2 getProduct2(String productType) {
        return null;
    }
}
