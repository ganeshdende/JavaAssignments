package com.assignment.javacourse.Section4;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        myArray =new int[3];
        myArray[0]=2;
        myArray[1]=3;
        myArray[2]=4;
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        for(int i:myArray){
            System.out.println(i);
        }
    }
}
