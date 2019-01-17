package com.libf.observer.impl;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {
    private String name;
    private Object message;

    public MyObserver(String name,Observable o) {
        this.name = name;
        o.addObserver(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        this.message = arg;

        Object o1 = ((MyObservable)o).getContent();
//        System.out.println(o1);
        //如何实现观察者模式的异步通知    TODO
//        try {
//            if ("实时观察者三号".equals(name))
//                throw new NullPointerException("同步测试");
//        }finally {
//            System.out.println("继续执行");
//        }

        System.out.println(name+" 接受消息：拉式"+((MyObservable)o).getContent());


        System.out.println(name+" 接受消息：推式"+message);
    }
}
