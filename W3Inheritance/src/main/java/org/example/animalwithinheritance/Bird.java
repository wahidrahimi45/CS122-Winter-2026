package org.example.animalwithinheritance;

public class Bird extends Animal{
    private double wingSpan;

    public void fly()
    {
        System.out.println(this.getName()+" can fly high");
    }

    //Constructors

    public Bird() { // default / no arg constructor

        System.out.println("Bird class no arg constructor get called");
    }
    public Bird(double wingSpan)
    {
        super();
        this.wingSpan = wingSpan;
    }

    //Getters and Setters

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
