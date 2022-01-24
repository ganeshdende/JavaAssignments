package com.assignment.Assignment6.Question4;

public class Main {
    Main(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Main m=new Main("hello");
        Main[] newMain=new Main[3];
        newMain[0]=new Main("object1");
        newMain[0]=new Main("object2");
        newMain[0]=new Main("object3");

    }
}
