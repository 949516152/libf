package com.libf.proxy.dynamic_proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    /***
     * 描述：入参为被代理对象
     * @param object 被代理对象
     */
    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    /***
     *
     * @param proxy 代理对象
     * @param method 接口方法 用于反射机制
     * @param args 参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前动态处理");

        Object result = method.invoke(object,args);

        System.out.println("买房失败");
        return result;
    }
}
