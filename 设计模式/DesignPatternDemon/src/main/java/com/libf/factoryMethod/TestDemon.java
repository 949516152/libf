package com.libf.factoryMethod;

import com.libf.factoryMethod.impl.MyFactoryImpl;
import com.libf.factoryMethod.interfaces.IMyMessage;
import com.libf.factoryMethod.interfaces.MyFactory;

public class TestDemon {

    public static void main(String[] args) throws Exception {
        MyFactory factory = new MyFactoryImpl();
        IMyMessage message = factory.createMessage(MyFactoryImpl.SMS);
        message.sendMessage();
    }
}
