package com.pattern.adapter;

public class Mobile {
    public void inputPower(IV5Power iv5Power) {
        int provideV5Power = iv5Power.provideV5power();
        System.out.println("我需要5V电压充电，现在是-->"+provideV5Power);

    }
}
