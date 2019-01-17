package com.libf.observer.impl;

public class MyTest {
    public static void main(String[] args) {
//       创建被观察者对象
        MyObservable myObservable = new MyObservable();

//        创建观察者对象
        new MyObserver("实时观察者一号",myObservable);
        new MyObserver("实时观察者二号",myObservable);
        new MyObserver("实时观察者三号",myObservable);
        new MyObserver("实时观察者四号",myObservable);

        System.out.println("观察者总数量："+myObservable.countObservers());

        System.out.println("===============================");
        myObservable.sendMessage("开始发生变化");


    }
}
