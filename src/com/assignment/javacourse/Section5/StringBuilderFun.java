package com.assignment.javacourse.Section5;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ganesh");
        sb.append(" dende");
        System.out.println(sb);
        sb.insert(7,"kuravadu ");
        System.out.println(sb);
        sb.replace(7,14,"kl");
        System.out.println(sb);
        StringBuilder teacherName=new StringBuilder("John Baugh");
        teacherName.replace(0,4,"Dr");
        System.out.println(teacherName);
    }
}
