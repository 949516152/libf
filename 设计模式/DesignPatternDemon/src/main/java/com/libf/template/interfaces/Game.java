package com.libf.template.interfaces;

/***
 * 模板方法：可以理解为在抽象类中有一个执行方法调用了抽象类的抽象或其他方法
 */
public abstract class Game {
    public abstract void initialized();
    public abstract void start();
    public abstract void end();


    public void play()
    {
        initialized();
        start();
        end();
    }
}
