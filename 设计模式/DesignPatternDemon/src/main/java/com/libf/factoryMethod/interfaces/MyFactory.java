package com.libf.factoryMethod.interfaces;

/***
 * 描述：工厂方法模式  工厂接口
 */
public interface MyFactory {

//    工厂的行为createMessage方法
    IMyMessage createMessage(String messageType) throws Exception;
}
