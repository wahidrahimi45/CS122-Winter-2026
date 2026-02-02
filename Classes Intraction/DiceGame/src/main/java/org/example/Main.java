package org.example;

import org.example.dice.Dice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dice sixSidedDice = new Dice(20);
//        Dice eightSidedDice = new Dice(8);
//        Dice oneSidedDice = new Dice(5);
//        Dice myDice = new Dice();

//        System.out.println(sixSidedDice);
//        System.out.println(eightSidedDice);
//        System.out.println(oneSidedDice);
//        System.out.println(myDice);

        //sixSidedDice.roll();
        System.out.println(sixSidedDice.roll10Times());


    }
}