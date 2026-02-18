package org.example;

public class Eagle extends Bird {

    public Eagle(String name, int age, double weight, String color,
                 double wingSpan, boolean canFly, double flySpeed) {

        super(name, age, weight, color, wingSpan, canFly, flySpeed);
    }

    public void hunt() {
        System.out.println(name + " is hunting.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes eagle sound.");
    }
}
