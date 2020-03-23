package com.pattern.adapter;

public class V5PowerAdapter implements IV5Power {

    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5power() {
        int power = v220Power.provideV220Power();
        //power经过各种操作-->5
        System.out.println("适配器：我悄悄的适配了电压。");
        return 5;
    }
}
