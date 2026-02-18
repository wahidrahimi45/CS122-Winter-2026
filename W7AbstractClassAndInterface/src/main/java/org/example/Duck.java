package org.example;

public class Duck extends Bird {

    public Duck(String name, int age, double weight, String color,
                double wingSpan, boolean canFly, double flySpeed) {

        super(name, age, weight, color, wingSpan, canFly, flySpeed);
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Quack Quack!");
    }
}
