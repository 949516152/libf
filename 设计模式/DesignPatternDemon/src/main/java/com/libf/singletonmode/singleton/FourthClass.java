package com.libf.singletonmode.singleton;

/***
 * 饿汉模式
 * 使用静态代码块进行预加载
 */
public class FourthClass{
    /***
     * 私有化静态成员属性
     */
    private static FourthClass fourthClass;

    /***
     * 静态代码块，在加载对象之前已经对加载静态成员，包括静态方法与静态属性
     */
    static{
        fourthClass = new FourthClass();
    }

    /***
     * 私有化构造方法
     */
    private FourthClass(){};


    /***
     * 公开静态方法返回对象实例
     * @return
     */
    public static FourthClass getInstance(){

        return fourthClass;
    }
}
