package org.example;

/**
 * Animal class is the ROOT parent class
 * All animals share these common properties and behaviors
 */
public abstract class Animal {

    // Common properties shared by ALL animals
    protected String name;
    protected int age;
    protected double weight;
    protected String color;

    // Constructor
    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Common behaviors
//    public void eat() {
//        System.out.println(name + " is eating.");
//    }
    public abstract void eat();

//    public void sleep() {
//        System.out.println(name + " is sleeping.");
//    }
    public abstract void sleep();

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void showInfo() {
        System.out.println("Animal Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}