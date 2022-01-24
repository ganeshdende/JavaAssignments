package com.assignment.Assignment7.Question4;

public class TriCycleFactory implements  CycleFactory{

    @Override
    public Cycle getNewCycle() {
        return new Tricycle();
    }
}
