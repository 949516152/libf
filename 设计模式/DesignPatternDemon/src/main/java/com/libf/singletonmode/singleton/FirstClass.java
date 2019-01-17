package com.libf.singletonmode.singleton;

/**
 * 单例模式：懒汉模式
 *          双重检查 double-check
 * @author libingfeng
 */
public class FirstClass {

    /****
     * 私有化本类属性
     */
    private static FirstClass firstClass = null;

    /**
     * 私有化构造方法
     */
    private FirstClass(){
    }

    /****
     * 公开静态方法返回对象实例
     * 进行双重检查,避免方法被锁
     *  与此区别与 单重检查
     * @return
     */
    public static FirstClass getFirstClass(){

        if (firstClass == null){
//            该方式与同步方法相同作用
            synchronized (FirstClass.class){
//                添加第二重检查防止线程安全
                if (firstClass == null) {
                    firstClass = new FirstClass();
                    return firstClass;
                }
            }
        }

        return firstClass;
    }
}

class SixClass {

    /****
     * 私有化本类属性
     */
    private static SixClass sixClass = null;

    /**
     * 私有化构造方法
     */
    private SixClass(){
    }

    /****
     * 公开静态方法返回对象实例
     * 进行单重检查，但可能单值方法被谁
     *
     * @return
     */
    public static SixClass getFirstClass(){

//            该方式与同步方法相同作用
        synchronized (SixClass.class){
//                添加第二重检查防止线程安全
            if (sixClass == null) {
                sixClass = new SixClass();
            }
        }

        return sixClass;
    }
}

