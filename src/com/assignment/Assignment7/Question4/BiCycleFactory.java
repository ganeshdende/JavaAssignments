package com.assignment.Assignment7.Question4;

public class BiCycleFactory implements CycleFactory{

    @Override
    public Cycle getNewCycle() {
        return new Bicycle();
    }
}
