package org.example.dice;

import java.util.Random;

// Rolls twice and returns the higher value
public class WeightedDice extends Dice {

    private static final Random RANDOM = new Random();

    public WeightedDice(int side) {
        super(side);
    }

    @Override
    public int roll() {
        int roll1 = RANDOM.nextInt(getSide()) + 1;
        int roll2 = RANDOM.nextInt(getSide()) + 1;

        sideValue = Math.max(roll1, roll2);
        return sideValue;
    }
}
