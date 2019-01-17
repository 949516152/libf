package com.libf.adapterpattern.adaptee.impl;

import com.libf.adapterpattern.adaptee.AdapteeDemon;

public class AdapteeImpl implements AdapteeDemon {
    @Override
    public void play() {
        System.out.println("play");
    }
}
