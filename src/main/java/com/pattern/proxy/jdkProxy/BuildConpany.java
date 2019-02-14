package com.pattern.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * InvocationHandler的作用
 * 在动态代理中InvocationHandler是核心，每个代理实例都具有一个关联的调用处理程序(InvocationHandler)。
 * 对代理实例调用方法时，将对方法调用进行编码并将其指派到它的调用处理程序(InvocationHandler)的 invoke 方法。
 * 所以对代理方法的调用都是通InvocationHadler的invoke来实现中，而invoke方法根据传入的代理对象，
 * 方法和参数来决定调用代理的哪个方法
 * invoke方法签名：invoke（Object Proxy，Method method，Object[] args）
 */
//1.通过实现InvocationHandler接口来自定义自己的InvocationHandler;
public class BuildConpany implements InvocationHandler {

    private Object taget;

    public Object bind(Object taget){
        this.taget = taget;
        //2.通过Proxy.getProxyClass获得动态代理
        return Proxy.newProxyInstance(taget.getClass().getClassLoader(),taget.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("建造前");
        //3.通过反射机制获得代理类的构造方法，方法签名为getConstructor(InvocationHandler.class)
        //proxy.getClass().getConstructor(taget.getClass());
        //5.通过代理对象调用目标方法
        result = method.invoke(taget,args);
        System.out.println("建造后");
        return result;
    }
}
