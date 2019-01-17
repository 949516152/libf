package com.libf.factoryAbstract.interfaces;

public interface ProductFactory {
    IProduct1 getProduct1(String productType);
    IProduct2 getProduct2(String productType);
}
