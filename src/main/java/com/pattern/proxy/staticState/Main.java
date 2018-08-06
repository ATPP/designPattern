package com.pattern.proxy.staticState;


public class Main {

    public static void main(String args[]) {
        SchoolGril schoolGril = new SchoolGril();
        schoolGril.setName("史蒂夫");

//        Persuit persuit = new Persuit(schoolGril);
//        persuit.giveChocolate();
//        persuit.giveDolls();
//        persuit.giveFlower();

        Proxy proxy = new Proxy(schoolGril);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlower();
    }
}
