package org.example.animalwithoutinheritance;

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

    // Constructors

    public Cat() {
    }

    public Cat(String name, int age, double weight, String color, int clawSharpness, double size) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.clawSharpness = clawSharpness;
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

    public int getClawSharpness() {
        return clawSharpness;
    }

    public void setClawSharpness(int clawSharpness) {
        this.clawSharpness = clawSharpness;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
