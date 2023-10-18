package com.medeiros.strategy;

public class DefensivelBehavior implements Behavior {


    @Override
    public void toMove() {
        System.out.println("Moving defensively...");
    }


}
