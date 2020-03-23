package com.pattern.adapter;

public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        IV5Power iv5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(iv5Power);
    }
}
