package com.medeiros.strategy;

public class AssertiveBehavior implements Behavior {


    @Override
    public void toMove() {
            System.out.println("Moving assertively...");
    }


}
