package org.example;

import org.example.inteface.Trainable;

public class Main {
    public static void main(String[] args) {
        // 2 Animal Objects
//        Animal animal1 = new Animal("GenericAnimal1", 5, 20.5, "Brown");
//        Animal animal2 = new Animal("GenericAnimal2", 3, 12.2, "White");
//
//
//        // 2 Mammal Objects
//        Mammal mammal1 = new Mammal("GenericMammal1", 4, 25.0, "Black", true);
//        Mammal mammal2 = new Mammal("GenericMammal2", 6, 40.0, "Gray", true);
//
//
//        // 2 Bird Objects
//        Bird bird1 = new Bird("GenericBird1", 2, 5.5, "Yellow", 0.8, true, 25.0);
//        Bird bird2 = new Bird("GenericBird2", 1, 3.2, "Blue", 0.6, true, 18.0);


        // 5 Dog Objects
        Animal dog1 = new Dog("Buddy", 3, 18.5, "Brown", true, "Golden Retriever");
        Dog dog2 = new Dog("Max", 5, 22.0, "Black", true, "Labrador");
        Dog dog3 = new Dog("Rocky", 2, 16.0, "White", true, "Husky");
        Dog dog4 = new Dog("Charlie", 4, 20.0, "Golden", true, "Beagle");
        Dog dog5 = new Dog("Jack", 6, 25.0, "Gray", true, "German Shepherd");


        // 5 Cat Objects
        Cat cat1 = new Cat("Luna", 2, 4.5, "White", true);
        Cat cat2 = new Cat("Bella", 3, 5.0, "Black", true);
        Cat cat3 = new Cat("Kitty", 1, 3.2, "Brown", true);
        Cat cat4 = new Cat("Lucy", 4, 5.5, "Gray", true);
        Cat cat5 = new Cat("Chloe", 2, 4.0, "Orange", true);


        // 5 Eagle Objects
        Eagle eagle1 = new Eagle("Hunter", 5, 6.5, "Dark Brown", 2.0, true, 120.0);
        Eagle eagle2 = new Eagle("Sky", 4, 5.8, "Golden", 1.8, true, 110.0);
        Eagle eagle3 = new Eagle("Storm", 6, 7.0, "Black", 2.2, true, 130.0);
        Eagle eagle4 = new Eagle("Falcon", 3, 5.2, "Gray", 1.7, true, 100.0);
        Eagle eagle5 = new Eagle("Flash", 2, 4.8, "White", 1.6, true, 95.0);



        // 5 Duck Objects
        Duck duck1 = new Duck("Daffy", 2, 3.5, "White", 0.5, true, 40.0);
        Duck duck2 = new Duck("Donald", 3, 3.8, "White", 0.6, true, 42.0);
        Duck duck3 = new Duck("Daisy", 1, 3.0, "Brown", 0.5, true, 38.0);
        Duck duck4 = new Duck("Lucky", 4, 4.0, "Gray", 0.7, true, 45.0);
        Duck duck5 = new Duck("Sunny", 2, 3.3, "Yellow", 0.5, true, 39.0);

        int age = 20;
        int[] numbers = {2,3,4,5};

        Animal[] catsAndEagles = {cat1, cat2, eagle2, eagle1, duck1, duck2, dog3};
        printAnilaDetails(catsAndEagles);
        // Calling methods to verify
//        animal1.showInfo();
//        System.out.println("-----------------------");
//
//        mammal1.showInfo();
//        System.out.println("-----------------------");
//
//        bird1.showInfo();
//        System.out.println("-----------------------");

        dog1.showInfo();
        System.out.println("-----------------------");

        cat1.showInfo();
        System.out.println("-----------------------");

        eagle1.showInfo();
        System.out.println("-----------------------");

        duck1.showInfo();
        System.out.println("-----------------------");


        Trainable[] trainables = {dog2, dog5};
    }

    public static void printAnilaDetails (Animal[] animals)
    {
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
    }
}