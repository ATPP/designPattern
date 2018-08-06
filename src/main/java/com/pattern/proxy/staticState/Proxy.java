package com.pattern.proxy.staticState;

//在实现方法中调用追求者类
public class Proxy implements GiveGift {

    Persuit persuit;

    public Proxy(SchoolGril schoolGril) {
        persuit = new Persuit(schoolGril);
    }

    @Override
    public void giveFlower() {
        System.out.println("买花");
        persuit.giveFlower();
    }

    @Override
    public void giveChocolate() {
        System.out.println("买巧克力");
        persuit.giveChocolate();
    }

    @Override
    public void giveDolls() {
        System.out.println("买洋娃娃");
        persuit.giveDolls();
    }
}
