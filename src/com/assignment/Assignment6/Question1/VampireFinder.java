package com.assignment.Assignment6.Question1;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class VampireFinder {
    int count=0;
    long num=1000;
    private static int numDigits(long num){
        return Long.toString(Math.abs(num)).length();
    }

    private static boolean fangChecker(long orig, long fang1, long fang2){
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")) return false;

        int origLen = numDigits(orig);
        if(numDigits(fang1) != origLen / 2 || numDigits(fang2) != origLen / 2) return false;

        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(fang1) + Long.toString(fang2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }
    boolean checker(long num){
        for(int j=2;j<=sqrt(num)+1;j++)
            if((num%j==0) && fangChecker(num,j,(int)num/j))
                return true;
        return false;
    }

    public void finder() {
        while(count<100){
            if(Long.toString(num).length()%2==0&&checker(num)){
                System.out.println(num);count++;
            }
            num++;
        }
    }
}
