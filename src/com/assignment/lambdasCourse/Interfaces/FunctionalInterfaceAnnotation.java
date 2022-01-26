package com.assignment.lambdasCourse.Interfaces;

public class FunctionalInterfaceAnnotation {
    @FunctionalInterface
     interface Cruncher
    {
        int crunch(int i,int j);
    }
    public int crunchService(int i,int j,Cruncher cruncher)
    {
        return cruncher.crunch(i,j);
    }
    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client=new FunctionalInterfaceAnnotation();
        //client1
        int ans=client.crunchService(3,4,(p,q)->p*q);
        //client2
        ans=client.crunchService(3,4,(p,q)->p+q);
        //client
        ans=client.crunchService(3,4,(p,q)->p-q);
        //client4
        ans=client.crunchService(3,4,(p,q)->p/q);
    }
}