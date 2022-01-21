package com.assignment.javacourse.Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        PrintWriter outFile;
        try{
            outFile=new PrintWriter("/home/ganesd/IdeaProjects/JavaAssignment/src/com/assignment/javacourse/Section8/output.txt");
            outFile.println("hwllo");
            outFile.println("welcome");
            outFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }
}
