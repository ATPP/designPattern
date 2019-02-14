package com.pattern.proxy.jdkProxy;

public class Test {
    public static void main(String[] args) {
        BuildConpany buildConpany = new BuildConpany();
        //4.通过构造函数获得代理对象并将自定义的InvocationHandler实例对象传为参数传入
        House house = (House) buildConpany.bind(new MyConpanyHouse());
        house.bulieHouse();
    }
}
