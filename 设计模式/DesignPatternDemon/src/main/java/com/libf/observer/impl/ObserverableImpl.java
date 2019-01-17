package com.libf.observer.impl;

import com.libf.observer.interfaces.MyObserver;
import com.libf.observer.interfaces.MyObservrable;

import java.util.ArrayList;
import java.util.List;

/***
 * 具体被观察者角色
 */
public class ObserverableImpl implements MyObservrable {
    private List<MyObserver> list = new ArrayList<MyObserver>();
    private String message;
    @Override
    public void registerObserver(MyObserver observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        if (!list.isEmpty())
            list.remove(observer);
    }

    @Override
    public void noticeObserver() {
        for (MyObserver i:list
             ) {
            i.updateMsg(message);
        }
    }


    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        noticeObserver();
    }
}
