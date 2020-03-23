package com.pattern.strategy.imp;

import com.pattern.strategy.IDisplay;

public class DispayMY implements IDisplay {
    @Override
    public void play() {
        System.out.println("布甲");
    }
}
