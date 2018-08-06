package com.pattern.proxy.jdkProxy;

public class Test {
    public static void main(String[] args) {
        BuildConpany buildConpany = new BuildConpany();
        House house = (House) buildConpany.bind(new MyConpanyHouse());
        house.bulieHouse();
    }
}
