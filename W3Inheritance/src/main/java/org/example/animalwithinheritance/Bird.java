package org.example.animalwithinheritance;

/**
 * Bird is a child class of Animal.
 * It inherits common fields and adds bird-specific behavior.
 */
public class Bird extends Animal {

    private double wingSpan;

    public Bird(String name, int age, double weight, String color, double wingSpan) {
        super(name, age, weight, color); // initialize parent fields
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps on a tree");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps");
    }

    @Override
    public String toString() {
        return "Wing Span: " + wingSpan + " ft\n" + super.toString();
    }
}
