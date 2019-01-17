package com.libf.responsechain;

import com.libf.responsechain.myinterface.PriceHandle;

public class Manager extends PriceHandle {
    @Override
    public void handle(float discount) {
        if (discount <= 0.20){
            System.out.println("经理批准了折扣 "+discount);
        }else {
            successor.handle(discount);
        }
    }
}
