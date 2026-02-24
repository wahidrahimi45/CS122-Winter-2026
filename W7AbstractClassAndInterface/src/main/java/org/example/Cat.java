package org.example;

public class Cat extends Mammal {

    public Cat(String name, int age, double weight, String color, boolean hasFur) {
        super(name, age, weight, color, hasFur);
    }

    public void climb() {
        System.out.println(name + " is climbing.");
    }

    public void scratch() {
        System.out.println(name + " is scratching.");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}