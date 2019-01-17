package com.libf.template.impl;

import com.libf.template.interfaces.Game;

public class FootBall extends Game {
    @Override
    public void initialized() {
        System.out.println("初始化");
    }

    @Override
    public void start() {
        System.out.println("开始执行");
    }

    @Override
    public void end() {
        System.out.println("结束游戏");
    }
}
