package org.example.animalwithinheritance;

public class Main {
    public static void main(String[] args) {
        // Birds
        Animal bird1 = new Bird("Parrot", 2, 1.5, "Green", 2.3);
        System.out.println(bird1);
        Bird bird2 = new Bird("Eagle", 5, 6.0, "Brown", 7.5);

        // Cats
        Cat cat1 = new Cat("Kitty", 3, 4.2, "White", 8);
        Cat cat2 = new Cat("Tiger", 6, 180, "Orange", 10);

        // Dogs
        Dog dog1 = new Dog("Buddy", 4, 20, "Brown", "Labrador", 30);
        Dog dog2 = new Dog("Rocky", 7, 28, "Black", "German Shepherd", 35);

        // Polymorphism in action
        Animal[] animals = { bird1, bird2, cat1, cat2, dog1, dog2 };

        for (Animal a : animals) {
            a.eat();
            a.sleep();
            a.makeSound();
            System.out.println("----------------------");
        }
    }

    // Method Overloading
    public static int add(int x)
    {
        return x+1;
    }
    public static int add(int x, int y)
    {
        return x+y;
    }
}
