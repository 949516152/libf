package com.libf.proxy.CGLIBProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object target;

//    创建代理对象
    public Object getInstance(final Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();//用于创建代理
        enhancer.setSuperclass(this.target.getClass());///设置代理目标
        enhancer.setCallback(this);//设置回调
        enhancer.setClassLoader(this.target.getClass().getClassLoader());//设置类加载器
        return enhancer.create();//创建代理对象
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("买房前准备");
        Object result = method.invoke(target,objects);

//        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("买房结束");
        return result;
    }
}
