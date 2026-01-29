package org.example.animalwithinheritance;

/**
 * Dog is a child class of Animal.
 * Adds dog-specific properties and behaviors.
 */
public class Dog extends Animal {

    private String breed;
    private double size;

    public Dog(String name, int age, double weight, String color,
               String breed, double size) {
        super(name, age, weight, color);
        this.breed = breed;
        this.size = size;
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof Woof");
    }
}
