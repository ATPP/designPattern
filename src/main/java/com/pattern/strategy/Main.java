package com.pattern.strategy;

import com.pattern.strategy.imp.AtteackRLSZ;
import com.pattern.strategy.imp.DefenceTBS;
import com.pattern.strategy.imp.DispayMY;
import com.pattern.strategy.imp.RunLBWB;

public class Main {

    public static void main(String[] args) {
        Role roleA = new RoleA("张飞");
        roleA.setDisplay(new DispayMY()).setAttack(new AtteackRLSZ()).setDefence(new DefenceTBS()).setRun(new RunLBWB());
        System.out.println(((RoleA) roleA).getName());
        roleA.display();
        roleA.run();
        roleA.attack();
        roleA.defence();
    }
}
