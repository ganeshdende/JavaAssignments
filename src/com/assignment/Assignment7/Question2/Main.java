package com.assignment.Assignment7.Question2;

public class Main {
    public static void main(String[] args) {
        Cycle [] cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();
        for(Cycle c:cycles){
            c.balance();
        }
        Unicycle u=new Unicycle();
        Bicycle b=new Bicycle();
        Tricycle t=new Tricycle();
        u.balance();
        b.balance();
        t.balance();

    }
}
