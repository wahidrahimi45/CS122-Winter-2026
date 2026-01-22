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
}
