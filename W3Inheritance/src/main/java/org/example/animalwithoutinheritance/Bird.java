package org.example.animalwithoutinheritance;

public class Bird {
    private String name;
    private int age;
    private  double weight;
    private String color;
    private double wingSpan;
    private double size;

    // Methods
    public void eat()
    {
        System.out.println(this.name + " is eating");
    }
    public void sleep ()
    {
        System.out.println(this.name + " is sleeping");
    }
    public void makeSound()
    {
        System.out.println(this.name+" Make sound like Chirps");
    }
    public void fly()
    {
        System.out.println(this.name+" can fly high");
    }

    //Constructors

    public Bird() { // default / no arg constructor
    }

    public Bird(String name, int age, double weight, String color, double wingSpan) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.wingSpan = wingSpan;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
