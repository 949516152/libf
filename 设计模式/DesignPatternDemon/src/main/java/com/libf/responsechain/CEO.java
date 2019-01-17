package com.libf.responsechain;

import com.libf.responsechain.myinterface.PriceHandle;

public class CEO extends PriceHandle {
    @Override
    public void handle(float discount) {
        if (discount <= 0.50){
            System.out.println("CEO批准了折扣 "+discount);
        }else {
            System.out.println("CEO拒绝了折扣"+discount);
        }
    }
}
