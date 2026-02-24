package org.example;

import org.example.inteface.Flyable;
import org.example.inteface.Trainable;

public class Parrot extends Bird implements Trainable, Flyable {

    public Parrot(String name, int age, double weight, String color,
                double wingSpan, boolean canFly, double flySpeed) {

        super(name, age, weight, color, wingSpan, canFly, flySpeed);
    }
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void train() {

    }
}
