package com.libf.responsechain;

import com.libf.responsechain.myinterface.PriceHandle;

public class Customer {
    private PriceHandle successor;

    public void setPriceHandle(PriceHandle successor) {
        this.successor = successor;
    }

    public void requestDiscount(float discount){
        successor.handle(discount);
    }
}
