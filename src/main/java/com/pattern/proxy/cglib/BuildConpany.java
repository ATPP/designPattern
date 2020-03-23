package com.pattern.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//2.定义一个拦截器。在调用目标方法时，CGLib会回调MethodInterceptor接口方法拦截，
// 来实现你自己的代理逻辑，类似于JDK中的InvocationHandler接口
public class BuildConpany implements MethodInterceptor {

    private Object target;

    public Object getInstans(Object target){
        this.target = target;
        //为目标对象动态生成一个子类，并将横切逻辑附加到该子类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("建造新的之前");
        methodProxy.invokeSuper(o,objects);
        System.out.println("建造新的之后");
        return null;
    }
}
