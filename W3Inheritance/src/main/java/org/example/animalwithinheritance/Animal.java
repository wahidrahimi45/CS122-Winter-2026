package org.example.animalwithinheritance;

/**
 * Parent class representing common properties and behaviors
 * shared by all animals.
 */
public class Animal {

    // Common fields (shared by all animals)
    private String name;
    private int age;
    private double weight;
    private String color;

    // Default constructor
    public Animal() {
        System.out.println("Animal default constructor called");
    }

    // Parameterized constructor
    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Getters & Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    // Common behaviors
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight + " lb\n" +
                "Color: " + color + "\n";
    }
}
