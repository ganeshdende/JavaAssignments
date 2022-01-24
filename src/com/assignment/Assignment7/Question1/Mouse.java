package com.assignment.Assignment7.Question1;

public class Mouse extends Rodent {
    Mouse(){
        System.out.println("this is mouse class");
    }
    @Override
    void hasTail() {
        System.out.println("Mouse has long tail");
    }
    void size(){
        System.out.println("Average size :1-7 inches");

    }
}
