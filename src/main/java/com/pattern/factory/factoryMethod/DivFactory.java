package com.pattern.factory.factoryMethod;

import com.pattern.factory.simple.DivOperation;
import com.pattern.factory.simple.Operation;

public class DivFactory implements IFactory {
    @Override
    public Operation createOpertoin() {
        return new DivOperation();
    }
}
