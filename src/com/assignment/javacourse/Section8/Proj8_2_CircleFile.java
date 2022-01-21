package com.assignment.javacourse.Section8;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import  java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> c = new ArrayList<>();
        int radius;
        try {
            Scanner circle = new Scanner(new File("/home/ganesd/IdeaProjects/JavaAssignments/src/com/assignment/javacourse/Section8/circle_data.txt"));
            while(circle.hasNext()) {
                radius = circle.nextInt();
                c.add(new Circle(radius));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            PrintWriter pr =new PrintWriter("/home/ganesd/IdeaProjects/JavaAssignments/src/com/assignment/javacourse/Section8/circles_output.txt");
            for (Circle cir : c) {
                System.out.println("Radius of circle "+cir.getRadius());
                pr.println("Radius of Circle : "+cir.getRadius());
                System.out.println("Area of Circle is "+cir.area());
                pr.println("Area of Circle : "+cir.area());

            }
            pr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}

