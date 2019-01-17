package com.libf.singletonmode.singleton;

/**
 * 饿汉模式
 * @author libingfeng
 */
public class ThirdClass {

    private static ThirdClass thirdClass = new ThirdClass();

    private  ThirdClass(){};

    public static ThirdClass getInstance(){

        return thirdClass;
    }
}
