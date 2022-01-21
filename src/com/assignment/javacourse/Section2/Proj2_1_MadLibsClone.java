package com.assignment.javacourse.Section2;

import java.util.Scanner;

public class Proj2_1_MadLibsClone {
    public static void main(String[] args) {
        String adjective,girlName,anotherAdjective,occupation,place,clothes,hobby,adjective3,anotherOccupation,boyName,manName;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter Adjective");
        adjective=scanner.nextLine();
        System.out.println("Enter girl name");
        girlName=scanner.nextLine();
        System.out.println("Enter another Adjective");
        anotherAdjective=scanner.nextLine();
        System.out.println("Enter occupation");
        occupation=scanner.nextLine();
        System.out.println("Enter place");
        place=scanner.nextLine();
        System.out.println("Enter clothes type");
        clothes=scanner.nextLine();
        System.out.println("enter hobby");
        hobby=scanner.nextLine();
        System.out.println("Enter another adjective");
        adjective3=scanner.nextLine();
        System.out.println("enter another occupations");
        anotherOccupation=scanner.nextLine();
        System.out.println("enter boy name");
        boyName=scanner.nextLine();
        System.out.println("enter man name");
        manName=scanner.nextLine();
        System.out.println("There once was a"+adjective+" girl named"+girlName+" who was a "+anotherAdjective+" "+occupation+" in kingdom of "+place+".");
        System.out.println("She loved to wear "+clothes+" and to "+hobby+". She wanted to marry "+adjective3+ " "+anotherOccupation +" named "+boyName+" but her father,King "+manName+" forbid her from seeing him");
    }
}
