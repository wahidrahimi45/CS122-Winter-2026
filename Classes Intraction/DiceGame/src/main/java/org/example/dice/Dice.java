package org.example.dice;

import java.util.Random;

public class Dice {

    private static final Random RANDOM = new Random(); // shared Random
    private int side;          // number of sides
    protected int sideValue;   // last rolled value

    private final int[] acceptedSides = {6, 8, 10, 16, 20};

    public Dice() {
        this.side = 6;
    }

    public Dice(int side) {
        for (int s : acceptedSides) {
            if (s == side) {
                this.side = side;
                return;
            }
        }
        System.out.println("Invalid side. Defaulting to 6.");
        this.side = 6;
    }

    // Rolls the dice once
    public int roll() {
        sideValue = RANDOM.nextInt(side) + 1;
        return sideValue;
    }

    // Rolls the dice 10 times and sums results
    public int roll10Times() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += roll();
        }
        return result;
    }

    public int getSide() {
        return side;
    }

    public int getSideValue() {
        return sideValue;
    }

    @Override
    public String toString() {
        return side + " sided dice";
    }
}