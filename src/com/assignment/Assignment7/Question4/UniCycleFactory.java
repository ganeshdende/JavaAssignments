package com.assignment.Assignment7.Question4;

public class UniCycleFactory implements CycleFactory{
    @Override
    public Cycle getNewCycle() {
        return new Unicycle();
    }
}
