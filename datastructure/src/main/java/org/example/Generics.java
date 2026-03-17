package org.example;

import java.util.ArrayList;

/*
    Generics = Type Safety

    Generics allow you to specify what type of data a collection should store.
 */
public class Generics {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        //numbers.add("pen");
        numbers.add(2);
        numbers.add(2);

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Ahmad");

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product());
        products.add(new Product());
        products.add(new Product());
        products.add(new Product());
        products.add(new Product());

        ArrayList<Double> doubles = new ArrayList<>();


    }
}
class Product{
    String productName;
    double productPrice;
}