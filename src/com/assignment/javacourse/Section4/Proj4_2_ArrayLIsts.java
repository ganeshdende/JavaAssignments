package com.assignment.javacourse.Section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLIsts {
    public static void main(String[] args) {
        double posnum = 0;
        ArrayList<Double> realnums=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter non negative number");
        posnum=scanner.nextDouble();
        while(posnum>=0){
            realnums.add(posnum);
            System.out.println("Enter non negative number");
            posnum=scanner.nextDouble();
        }
        for(int i=realnums.size()-1;i>=0;i--){
            System.out.println(realnums.get(i));
        }

    }
}
