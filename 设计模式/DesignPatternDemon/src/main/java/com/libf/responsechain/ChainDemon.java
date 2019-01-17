package com.libf.responsechain;

import com.libf.responsechain.myinterface.PriceHandleFactory;

import java.util.Random;

public class ChainDemon {
    public static void main(String[] args){
        Customer customer = new Customer();

        customer.setPriceHandle(PriceHandleFactory.createPriceHandle());

        Random random = new Random();

        for (int i =0;i <100; i++) {
            System.out.print("第"+i+ "次： ");
            customer.requestDiscount(random.nextFloat());
        }
    }
}
