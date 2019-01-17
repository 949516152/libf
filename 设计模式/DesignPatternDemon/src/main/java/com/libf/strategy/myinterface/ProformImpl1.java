package com.libf.strategy.myinterface;

public class ProformImpl1 implements Perform {
    @Override
    public void proformWork() {
        System.out.println("物理罢工");
    }
}
