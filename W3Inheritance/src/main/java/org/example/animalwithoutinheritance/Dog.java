package org.example.animalwithoutinheritance;

public class Dog {
    private String name;
    private int age;
    private  double weight;
    private String color;
    private String breed;
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
        System.out.println(this.name+" Make sound like Woof Woof");
    }
    public void fetch()
    {
        System.out.println(this.name+" can fetch an object");
    }

    //Constructors

    public Dog() {
    }

    public Dog(String name, int age, double weight, String color, String breed, double size) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.breed = breed;
        this.size = size;
    }

    // Getters and Setter

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
