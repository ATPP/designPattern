package com.pattern.strategy;

public abstract class Role  {
    private IAttack attack;
    private IDisplay display;
    private IDefence defence;
    private IRun run;

    public Role setAttack(IAttack attack) {
        this.attack = attack;
        return this;
    }

    public Role setDisplay(IDisplay display) {
        this.display = display;
        return this;
    }

    public Role setDefence(IDefence defence) {
        this.defence = defence;
        return this;
    }

    public Role setRun(IRun run) {
        this.run = run;
        return this;
    }

    protected void display() {
        display.play();
    }

    protected void attack() {
        attack.attack();
    }

    protected void defence() {
        defence.defence();
    }

    protected void run() {
        run.run();
    }

}
