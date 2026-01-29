package org.example.animalwithinheritance;

/**
 * Cat is a child class of Animal.
 * Adds cat-specific behavior.
 */
public class Cat extends Animal {

    private int clawSharpness;

    public Cat(String name, int age, double weight, String color, int clawSharpness) {
        super(name, age, weight, color);
        this.clawSharpness = clawSharpness;
    }

    public void scratch() {
        System.out.println(getName() + " scratches with sharp claws");
    }

    public void climb() {
        System.out.println(getName() + " climbs a tree");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow Meow");
    }
}
