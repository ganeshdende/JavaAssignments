package com.assignment.Assignment7.Question4;

public class Main {
    public static void main(String[] args) {
        CycleFactory c=new BiCycleFactory();
        Cycle cycle =c.getNewCycle();
        cycle.noOfWheels();
    }
}
