package com.libf.strategy;

import com.libf.strategy.myinterface.Perform;

public class ProformImpl implements Perform {
    @Override
    public void proformWork() {
        System.out.println("罢工");
    }
}
