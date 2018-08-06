package com.pattern.factory.factoryMethod;

import com.pattern.factory.simple.Operation;
import com.pattern.factory.simple.SubOperation;

public class SubFactory implements IFactory {
    @Override
    public Operation createOpertoin() {
        return new SubOperation();
    }
}
