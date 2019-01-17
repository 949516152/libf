package com.libf.responsechain.myinterface;

import org.springframework.stereotype.Service;

/***
 * 责任链模式：
 * 提供子类使用的本类属性：继任者
 */
public abstract class PriceHandle {

    /***
     * 继任者，用于传递信息
     */
    protected PriceHandle successor;

    public void setPriceHandle(PriceHandle successor) {
        this.successor = successor;
    }

    /**
     * 用于处理折扣事宜
     * @param discount
     */
    public abstract void handle(float discount);

}
