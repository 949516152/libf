package com.libf.factoryMethod.impl;

import com.libf.factoryMethod.interfaces.MyFactory;

public class EMAILMessage extends MyMessageAbstract {
    @Override
    public void sendMessage() throws Exception {
        System.out.println(getMessageParam().get(MyFactoryImpl.EMAIL));
    }
}
