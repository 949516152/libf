package com.libf.observer.impl;

import java.util.Observable;

public class MyObservable extends Observable {
    private Object message;

    /***
     * 描述：被观察者对象发送消息
     * @param message
     */
    public void sendMessage(Object message){
        this.message = message;
        this.setChanged();
        this.notifyObservers(message);//推方式
        //this.notifyObservers();//拉方式
    }

    /***
     * 描述：被观察者对象提供全部数据
     * @return
     */
    public String getContent(){
        return "拉模型";
    }
}
