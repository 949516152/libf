package com.libf.factoryAbstract.interfaces;

public abstract class IProduct1 {
    protected volatile static String name;

    public static void setName(String name) {
        IProduct1.name = name;
    }

    public abstract void getProduct();
}
