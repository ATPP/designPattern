package com.pattern.factory.factoryMethod;

import com.pattern.factory.simple.Operation;

public class Main {
    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOpertoin();
        operation.setNumberA(1.1);
        operation.setNumberB(3.3);
        System.out.println(operation.getResult());
    }
}
