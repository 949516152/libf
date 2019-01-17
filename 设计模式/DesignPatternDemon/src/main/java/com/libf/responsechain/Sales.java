package com.libf.responsechain;

import com.libf.responsechain.myinterface.PriceHandle;

public class Sales extends PriceHandle {
    @Override
    public void handle(float discount) {
        if (discount <=0.05){
            System.out.println("销售员打折 "+discount);
        }else {
            successor.handle(discount);
        }
    }
}
