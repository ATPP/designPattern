package com.pattern.strategy.imp;

import com.pattern.strategy.IDefence;

public class DefenceTBS implements IDefence {
    @Override
    public void defence() {
        System.out.println("铁布衫");
    }
}
