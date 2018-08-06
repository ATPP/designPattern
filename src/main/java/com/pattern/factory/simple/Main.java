package com.pattern.factory.simple;

public class Main {

    public static void main(String args[]){
        Operation operation;
        operation = OperationFactory.createOperation("+");
        operation.setNumberA(1);
        operation.setNumberB(3);
        System.out.println(operation.getResult());
    }
}
