package com.assignment.Assignment9;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter line to check if it starts with capital and ends with .");
        String line=scanner.nextLine();
        Pattern p=Pattern.compile("^[A-Z].*\\.$");
        Matcher m=p.matcher(line);
        boolean match=m.matches();
        System.out.println(match);
    }
}
