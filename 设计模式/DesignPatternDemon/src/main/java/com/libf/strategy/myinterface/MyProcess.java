package com.libf.strategy.myinterface;

public abstract class MyProcess {
    protected Perform proform;

    public void setProform(Perform proform) {
        this.proform = proform;
    }

    protected  void doWork(){
        proform.proformWork();
    };

    public abstract int caculate(int num1, int num2);
}
