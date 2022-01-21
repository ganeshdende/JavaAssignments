package com.assignment.javacourse.Section3;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char grade;
        System.out.println("enter a grade");
        grade = keyboard.next().charAt(0);
        switch (grade) {
            case 'A' :
                System.out.println("great job");
                break;
            case 'B' :
                System.out.println("good job");
                break;
            case 'C' :
                System.out.println("you can do better");
                break;
            case 'D' :
                System.out.println("your are getting close to failing");
                break;
            case 'F' :
                System.out.println("you are failing the course");
                break;
            default :System.out.println("you have entered invalid grade");
        }
    }
}
