package com.pattern.factory.simple;

public class OperationFactory {

    public static Operation createOperation(String operat){
        Operation operation = null;
        switch (operat){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
        }
        return operation;
    }
}
