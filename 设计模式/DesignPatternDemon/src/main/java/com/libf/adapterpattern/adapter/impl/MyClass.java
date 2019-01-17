package com.libf.adapterpattern.adapter.impl;

import com.libf.adapterpattern.adapter.AbstractClass;

public class MyClass extends AbstractClass {
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println();
    }
}
