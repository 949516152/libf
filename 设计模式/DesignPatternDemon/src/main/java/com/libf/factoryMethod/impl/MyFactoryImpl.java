package com.libf.factoryMethod.impl;

import com.libf.factoryMethod.interfaces.IMyMessage;
import com.libf.factoryMethod.interfaces.MyFactory;

import java.util.HashMap;
import java.util.Map;

/***
 * 描述：工厂实现类
 */
public class MyFactoryImpl implements MyFactory {
//    工厂类中的产品类型
    public static final String SMS = "SMS";
    public static final String OA = "OA";
    public static final String EMAIL = "EMAIL";
    @Override
    public IMyMessage createMessage(String messageType) throws Exception {
        Map<String,Object> messageParam = new HashMap<String,Object>();
        IMyMessage myMessage;

        if (SMS.equals(messageType)){
            myMessage = new SMSMessage();
            messageParam.put("SMS","李冰锋SMS");
        }else if(EMAIL.equals(messageType)){
            myMessage = new EMAILMessage();
            messageParam.put("EMAIL","949516152@163.com");
        }else {
            myMessage = new SMSMessage();
            messageParam.put("SMS","默认方式SMS");
        }
        myMessage.setMessageParam(messageParam);
        return myMessage;
    }
}
