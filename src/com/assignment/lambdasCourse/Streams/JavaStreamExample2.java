package com.assignment.lambdasCourse.Streams;

import java.util.ArrayList;
import java.util.List;
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaStreamExample2 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
       /* List<Product> productPriceList2 =*/productsList.stream()
                .filter(p -> p.price > 10000)
                //.collect(Collectors.toList())
                .forEach(p->System.out.println(p.price));
      //  System.out.println(productPriceList2);
    }
}