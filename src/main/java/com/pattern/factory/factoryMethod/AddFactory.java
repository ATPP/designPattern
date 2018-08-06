package com.pattern.factory.factoryMethod;

import com.pattern.factory.simple.AddOperation;
import com.pattern.factory.simple.Operation;

public class AddFactory implements IFactory {
    @Override
    public Operation createOpertoin() {
        return new AddOperation();
    }
}
