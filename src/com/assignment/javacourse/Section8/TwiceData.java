package com.assignment.javacourse.Section8;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class TwiceData {
    public static void main(String[] args) {
        try{
            Scanner nums=new Scanner(new File("/home/ganesd/IdeaProjects/JavaAssignment/src/com/assignment/javacourse/Section8/nums.txt"));
            PrintWriter pr =new PrintWriter("/home/ganesd/IdeaProjects/JavaAssignment/src/com/assignment/javacourse/Section8/twice_nums.txt");
            int num;
            while(nums.hasNext()){
                num=nums.nextInt();
                pr.println(num*2);
            }
            pr.close();
            nums.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
