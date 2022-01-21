package com.assignment.javacourse.Section2;

import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNum,secondNum,thirdNum;
        System.out.println("Enter 1st num");
        firstNum= scanner.nextInt();
        System.out.println("Enter 2nd num");
        secondNum= scanner.nextInt();
        System.out.println("Enter 3rd num");
        thirdNum= scanner.nextInt();
        int sum=0;
        sum=firstNum+secondNum+thirdNum;
        float average;
        average=sum/3;
        System.out.println("Average of three numbers is "+average);
    }
}
