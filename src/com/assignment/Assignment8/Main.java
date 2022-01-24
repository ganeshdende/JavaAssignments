package com.assignment.Assignment8;
import java.util.Scanner;
public class Main {
    static void checkAccess(char access) throws ReadAccess,WriteAccess,DeleteAccess{
        if(access=='w')
            throw new WriteAccess("YOu dont have write access");
        if(access=='r')
            throw new ReadAccess("You dont have read access");
        if(access=='d')
            throw new DeleteAccess("You dont have delete access");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char access;
        try{
            System.out.println("Which access u want to check(r,w,d)?");
            access=scanner.next().charAt(0);
            checkAccess(access);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("you have other access apart from above ");
        }
    }
}
