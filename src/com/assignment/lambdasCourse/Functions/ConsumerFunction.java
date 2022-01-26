package com.assignment.lambdasCourse.Functions;
import java.util.function.Consumer;


public class ConsumerFunction{
    Consumer<String> printInfo=m-> System.out.println("printing out movie info : "+m);
    private void testConsumer(String movie)
    {
        printInfo.accept(movie);
    }

    public static void main(String[] args) {
        String m=new String("Gods must be crazy");
        new ConsumerFunction().testConsumer(m);

    }
}