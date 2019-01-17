package com.libf.strategy;

import com.libf.strategy.myinterface.MyProcess;
import com.libf.strategy.myinterface.Perform;

public class DoCaculate {

//    组合方式
    private MyProcess myProcess;
    private Perform proform;

    public DoCaculate(MyProcess myProcess, Perform proform) {
        this.myProcess = myProcess;
        this.proform = proform;
    }

    public int doCaculate(int num1, int num2){
        proform.proformWork();
        return myProcess.caculate(num1,num2);
    }
}
