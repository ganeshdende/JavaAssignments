package com.assignment.lambdasCourse.Functions;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    Supplier<String[]> fruitSupplier= () -> new String[]{"apple","orange"};
    private void testSupplier()
    {
        String[] fruits=fruitSupplier.get();
        for(String fruit:fruits)
        {
            System.out.println(fruit);
        }
    }
    public static void main(String[] args) {
        new SupplierFunctionalInterface().testSupplier();
    }
}