package org.example;

import org.example.inteface.Flyable;
import org.example.inteface.Swimmable;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, int age, double weight, String color,
                double wingSpan, boolean canFly, double flySpeed) {

        super(name, age, weight, color, wingSpan, canFly, flySpeed);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Quack Quack!");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly slowly over the water");
    }
}
