package com.pattern.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BuildConpany implements InvocationHandler {

    private Object taget;

    public Object bind(Object taget){
        this.taget = taget;
        return Proxy.newProxyInstance(taget.getClass().getClassLoader(),taget.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("建造前");
        result = method.invoke(taget,args);
        System.out.println("建造后");
        return result;
    }
}
