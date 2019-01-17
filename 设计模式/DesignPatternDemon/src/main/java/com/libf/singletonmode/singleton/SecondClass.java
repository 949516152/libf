package com.libf.singletonmode.singleton;

/**
 * 懒汉模式
 * @author libingfeng
 */
public class SecondClass {

    /***
     * 私有化静态成员 属性
     */
    private static SecondClass secondClass = null;

    /***
     * 私有化构造方法
     */
    private SecondClass(){}

    /***
     * 公开静态成员方法
     * @return
     */
    public static SecondClass getInstance(){

        if (secondClass == null){
            secondClass = new SecondClass();
        }

        return secondClass;
    }
}
