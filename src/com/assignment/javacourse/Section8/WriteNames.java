package com.assignment.javacourse.Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("ganesh");
        names.add("saketh");
        names.add("akhil");
        names.add("raju");
        names.add("ravi");
        try{
            PrintWriter pr=new PrintWriter("/home/ganesd/IdeaProjects/JavaAssignment/src/com/assignment/javacourse/Section8/names.txt");
            for(String i:names){
                System.out.println(i);
                pr.println(i);
            }
            pr.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
