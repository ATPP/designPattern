package com.pattern.factory.factoryMethod;

import com.pattern.factory.simple.MulOperation;
import com.pattern.factory.simple.Operation;

public class MulFactory implements IFactory {
    @Override
    public Operation createOpertoin() {
        return new MulOperation();
    }
}
