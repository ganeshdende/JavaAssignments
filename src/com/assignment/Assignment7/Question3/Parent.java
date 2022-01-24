package com.assignment.Assignment7.Question3;

public class Parent extends SubClass implements  Interface4{

    @Override
    public void method1() {
        System.out.println("this is method1");

    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }

    @Override
    public void method3() {
        System.out.println("this is method3");
    }

    @Override
    public void method4() {
        System.out.println("this is method4");
    }

    @Override
    public void method5() {
        System.out.println("this is method5");
    }

    @Override
    public void method6() {
        System.out.println("this is method6");
    }

    @Override
    public void method7() {
        System.out.println("this is method7");
    }
    void method_1(Interface1 i){
        i.method1();
        i.method2();
    }
    void method_2(Interface2 i){
        i.method3();
        i.method4();

    }
    void method_3(Interface3 i){
        i.method5();
        i.method6();

    }
    void method_4(Interface4 i){
        i.method7();

    }
}
