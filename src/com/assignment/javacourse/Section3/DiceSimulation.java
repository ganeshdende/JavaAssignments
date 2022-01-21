package com.assignment.javacourse.Section3;

import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random=new Random();
        int chance=0;
        while(chance<10){
            System.out.print(random.nextInt(6)+1+"\t");
            chance++;

        }

    }

}
