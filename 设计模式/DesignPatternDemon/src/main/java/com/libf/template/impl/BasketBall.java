package com.libf.template.impl;

import com.libf.template.interfaces.Game;

public class BasketBall extends Game {
    @Override
    public void initialized() {
        System.out.println("初始化BasketBall");
    }

    @Override
    public void start() {
        System.out.println("开始BasketBall");
    }

    @Override
    public void end() {
        System.out.println("结束BasketBall");
    }
}
