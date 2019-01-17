package com.libf.factoryMethod.interfaces;

import java.util.Map;

/***
 * 描述：产品类 提供产品的相关属性与行为
 */
public interface IMyMessage {

    Map<String,Object> getMessageParam();

    void setMessageParam(Map<String, Object> messageParam);

    void sendMessage() throws Exception;// 发送通知/消息
}
