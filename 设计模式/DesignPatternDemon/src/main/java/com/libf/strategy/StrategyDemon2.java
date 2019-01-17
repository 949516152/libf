package com.libf.strategy;

import com.libf.strategy.myinterface.MyProcess;

public class StrategyDemon2 extends MyProcess {

    @Override
    public int caculate(int num1, int num2) {
        return num1*num2;
    }
}
