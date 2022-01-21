package com.assignment.javacourse.Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameAges {
    public static void main(String[] args) {
        Scanner names,ages;
        String name,age;
        try{
            PrintWriter pr=new PrintWriter("/home/ganesd/IdeaProjects/JavaAssignment/src/com/assignment/javacourse/Section8/nameages.txt");
            names=new Scanner(new File("/home/ganesd/IdeaProjects/JavaAssignment/src/com/assignment/javacourse/Section8/names.txt"));
            ages=new Scanner(new File("/home/ganesd/IdeaProjects/JavaAssignment/src/com/assignment/javacourse/Section8/ages.txt"));
            while(names.hasNext() && ages.hasNext()){
                name=names.next();
                age=ages.next();
                pr.println(name +" is "+age +" years old");
            }
            pr.close();
            names.close();
            ages.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
