package com.assignment.lambdasCourse.Lambdas;

public class CreatingLambdas {
    interface Greetings{
        String hello(String a);
    }
    static void testGreetings(String a,Greetings g){
     System.out.println(g.hello(a));

    }

    public static void main(String[] args) {
        testGreetings("Shikavat",(String a)-> "hello "+a);

    }
}
