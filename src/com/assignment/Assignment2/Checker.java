package com.assignment.Assignment2;
import java.util.Scanner;

public class Checker {
    static boolean alphaChecker(char[] alpha){
        boolean[] alp=new boolean[26];
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]>='A'&&alpha[i]<='Z'){
                alp[alpha[i]-'A']=true;
            }
            if(alpha[i]>='a' &&alpha[i]<='z'){
                alp[alpha[i]-'a']=true;
            }
        }
        int count=0;
        for(int i=0;i<26;i++) {
            if (alp[i]) {
                count += 1;
            }
        }
        return count==26;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String");
        String line=scanner.nextLine();
        System.out.println(alphaChecker(line.toCharArray()));
    }
}
