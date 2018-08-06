package com.pattern.factory.simple;

public class SubOperation extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }

}
