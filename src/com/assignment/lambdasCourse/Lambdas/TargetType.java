package com.assignment.lambdasCourse.Lambdas;

public class TargetType {
    interface Email{
        String getEmail(String name);
    }
    static void printEmail(String name,Email e){
        System.out.println(e.getEmail(name));
    }

    public static void main(String[] args) {
        Email e=(String name)->name+"@zemosolabs.com";
        printEmail("ganesh.dende",e);
        printEmail("ganesh",e);
    }

}
