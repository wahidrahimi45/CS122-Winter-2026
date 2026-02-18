package org.example;

/**
 * Mammal is a child of Animal
 * Mammals inherit Animal properties and add their own
 */
public class Mammal extends Animal {

    // Specific property for Mammals
    protected boolean hasFur;

    // Constructor
    public Mammal(String name, int age, double weight, String color, boolean hasFur) {
        super(name, age, weight, color); // call Animal constructor
        this.hasFur = hasFur;
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void giveBirth() {
        System.out.println(name + " gives birth to live young.");
    }

    // Override showInfo()
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Has Fur: " + hasFur);
    }
}