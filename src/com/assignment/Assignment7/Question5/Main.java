package com.assignment.Assignment7.Question5;

public class Main {
    public static void main(String[] args) {
        SecondOuterClass s=new SecondOuterClass();
        SecondOuterClass.SecondInnerClass s1= s.new SecondInnerClass("hello");
    }
}
