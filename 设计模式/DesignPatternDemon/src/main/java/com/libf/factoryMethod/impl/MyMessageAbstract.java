package com.libf.factoryMethod.impl;

import com.libf.factoryMethod.interfaces.IMyMessage;

import java.util.Map;

public abstract class MyMessageAbstract implements IMyMessage {

    protected Map<String,Object> messageParam;

    @Override
    public Map<String, Object> getMessageParam() {
        return messageParam;
    }

    @Override
    public void setMessageParam(Map<String, Object> messageParam) {
        this.messageParam = messageParam;
    }
}
