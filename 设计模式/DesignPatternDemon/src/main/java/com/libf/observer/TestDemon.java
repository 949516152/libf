package com.libf.observer;

import com.libf.observer.impl.ObserverDemon;
import com.libf.observer.impl.ObserverableImpl;
import com.libf.observer.interfaces.MyObserver;

import java.util.Observable;

public class TestDemon {
    public static void main(String[] args) {
        MyObserver myObserver1 = new ObserverDemon("观察者1");
        MyObserver myObserver2= new ObserverDemon("观察者2");

        MyObserver myObserver3 = new ObserverDemon("观察者3");

        MyObserver myObserver4 = new ObserverDemon("观察者4");
        MyObserver myObserver5 = new ObserverDemon("观察者5");


        ObserverableImpl able = new ObserverableImpl();
        able.registerObserver(myObserver1);
        able.registerObserver(myObserver2);
        able.registerObserver(myObserver3);
        able.registerObserver(myObserver4);
        able.registerObserver(myObserver5);


        able.setInfomation("开始测试");

    }
}
