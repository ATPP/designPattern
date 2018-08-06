package com.pattern.proxy.staticState;

public class Persuit implements GiveGift {

    SchoolGril schoolGril;

    public Persuit(SchoolGril schoolGril) {
        this.schoolGril = schoolGril;
    }

    @Override
    public void giveFlower() {
        System.out.println(schoolGril.getName() + "给你花");
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGril.getName() + "给你洋娃娃");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGril.getName() + "给你巧克力");
    }

}
