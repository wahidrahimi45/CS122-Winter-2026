package org.example.randomizer;

public class Main {
    public static void main(String[] args) {
        Randomizer randomizer1 = new Randomizer();
        Randomizer randomizer2 = new Randomizer();
        Randomizer randomizer3 = new Randomizer();
        Randomizer randomizer4 = new Randomizer();

        for (int i = 0; i < 10; i++) {
            randomizer1.generate(10,20);
            randomizer2.generate(10,220);
            randomizer3.generate(30,50);
            randomizer4.generate(1,100);
            randomizer1.generate();
            randomizer4.generate();
        }


        System.out.println("Even numbers: "+ Randomizer.even);
        System.out.println("Odd numbers: "+ Randomizer.odd);
    }
}
