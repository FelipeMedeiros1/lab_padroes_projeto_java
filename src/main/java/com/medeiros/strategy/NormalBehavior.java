package com.medeiros.strategy;

public class NormalBehavior implements Behavior {


    @Override
    public void toMove() {
        System.out.println("Moving normally...");
    }
}
