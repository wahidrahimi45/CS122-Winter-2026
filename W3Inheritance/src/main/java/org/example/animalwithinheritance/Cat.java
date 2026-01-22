package org.example.animalwithinheritance;

public class Cat {
    private String name;
    private int age;
    private  double weight;
    private String color;
    private int clawSharpness;
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
        System.out.println(this.name+" Make sound like Mew Mew");
    }
    public void scratch()
    {
        System.out.println(this.name+" scratches the objects");
    }
    public void climb()
    {
        System.out.println(this.name +" can climb a tree");
    }
}
