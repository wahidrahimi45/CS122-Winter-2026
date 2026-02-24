package org.example;

import org.example.inteface.Swimmable;
import org.example.inteface.Trainable;

/**
 * Dog is a concrete class
 * Dog inherits Animal -> Mammal -> Dog
 */
public class Dog extends Mammal implements Swimmable, Trainable {

    private String breed;

    public Dog(String name, int age, double weight, String color,
               boolean hasFur, String breed) {

        super(name, age, weight, color, hasFur);
        this.breed = breed;
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Breed: " + breed);
    }

    @Override
    public void swim()
    {
        System.out.println("Dog can swim");
    }
    @Override
    public void train()
    {
        System.out.println("Dogs can be trained");
    }
}