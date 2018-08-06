package com.pattern.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class BuildConpany implements MethodInterceptor {

    private Object target;

    public Object getInstans(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("建造新的之前");
        methodProxy.invokeSuper(o,objects);
        System.out.println("建造新的之后");
        return null;
    }
}
