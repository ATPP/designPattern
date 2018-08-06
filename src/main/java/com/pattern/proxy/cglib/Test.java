package com.pattern.proxy.cglib;



public class Test {
    public static void main(String[] args) {
        BuildConpany buildConpany = new BuildConpany();
        MyConpanyHouse myConpanyHouse = (MyConpanyHouse) buildConpany.getInstans(new MyConpanyHouse());
        myConpanyHouse.bulieHouse();
    }
}
