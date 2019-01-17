package com.libf.factoryMethod.impl;

public class SMSMessage extends MyMessageAbstract {
    @Override
    public void sendMessage() throws Exception {
        System.out.println(getMessageParam().get("SMS"));
    }
}
