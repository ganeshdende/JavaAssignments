package com.assignment.javacourse.Section3;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        int totalcost=0;
        int packagechoice=0;
        int courses=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter package choice");
        packagechoice=scanner.nextInt();
        System.out.println("Enter no of courses");
        courses=scanner.nextInt();
        if(packagechoice==1){
            totalcost=10+6*(courses-2);
        }
        else if(packagechoice==2){
            totalcost=12+4*(courses-4);
        }
        else if(packagechoice==3){
            totalcost=15+3*(courses-6);
        }
        System.out.println("Total cost is "+totalcost);
    }
}
