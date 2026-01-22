package org.example.animalwithinheritance;

public class Animal { // parent class
    private String name;
    private int age;
    private  double weight;
    private String color;


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
        System.out.println(this.name+" Make sound ");
    }

    //Constructors

    public Animal() { // default / no arg constructor
    }

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
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

}
