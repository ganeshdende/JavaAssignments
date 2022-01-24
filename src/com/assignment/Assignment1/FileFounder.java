package com.assignment.Assignment1;
import java.util.Scanner;
import java.io.File;
import java.util.regex.Pattern;

public class FileFounder {
    static void findAbsolutePath(File file,String reg){
            for(File f:file.listFiles()){
               // System.out.println(f);
                if(f.isDirectory()) {
                    findAbsolutePath(f,reg);
                }
                boolean match=Pattern.matches(reg,f.getName());
                if(match){
                    System.out.println(f.getAbsolutePath());
                }
            }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Regular Expression");
        String reg=scanner.next();
        File file=new File("/home/ganesd/");
        findAbsolutePath(file,reg);
    }
}
