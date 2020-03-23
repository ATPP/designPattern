package com.pattern.strategy.imp;

import com.pattern.strategy.IRun;

public class RunLBWB implements IRun {
    @Override
    public void run() {
        System.out.println("凌波微步");
    }
}
