package com.libf.observer.impl;

import com.libf.observer.interfaces.MyObserver;

/***
 * 具体观察者角色
 */
public class ObserverDemon implements MyObserver {

    private String name;
    private  String message;

    public ObserverDemon(String name) {
        this.name = name;
    }

    @Override
    public void updateMsg(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name+" 接收到信息 "+message);
    }
}
