package com.assignment.javacourse.Section2;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class LogicalFun {
    static void printResultForVariousCombi(boolean isRaining,boolean isWarm){
        boolean combined=isRaining &&isWarm;
        System.out.println("is raining and warm :"+combined);
        combined=isRaining||isWarm;
        System.out.println("is raning or warm :"+combined);
        combined=!isRaining;
        System.out.println("is not raining outside :"+combined);
    }
    public static void main(String[] args) {
        boolean isRaining=true;
        boolean isWarm=false;
        printResultForVariousCombi(isRaining,isWarm);
        isRaining=true;
        isWarm=true;
        printResultForVariousCombi(isRaining,isWarm);
        isRaining=false;
        isWarm=true;
        printResultForVariousCombi(isRaining,isWarm);
        isRaining=false;
        isWarm=false;
        printResultForVariousCombi(isRaining,isWarm);

    }
}
