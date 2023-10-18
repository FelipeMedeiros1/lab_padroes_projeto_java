package com.medeiros.strategy;

public class Robo {

    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }
    public void toMove(){
        behavior.toMove();
    }
}
