package com.libf.observer.interfaces;

/***
 * 抽象被观察者角色
 */
public interface MyObservrable {
    void registerObserver(MyObserver observer);

    void removeObserver(MyObserver observer);

    void noticeObserver();
}
