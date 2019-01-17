package com.libf.decorator.impl;

import com.libf.decorator.interfaces.Hero;

/**
 * @author libingfeng
 */
public class HeroImpl implements Hero {

    @Override
    public void run() {
        System.out.println("Hero can run");
        System.out.println("Hero learn some skills:");
    }
}
