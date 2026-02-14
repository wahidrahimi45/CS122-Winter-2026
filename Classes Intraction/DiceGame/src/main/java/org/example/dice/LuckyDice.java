package org.example.dice;

import org.example.enums.Color;

import javax.swing.*;
import java.util.Random;

// Always rolls at least 70% of max side
public class LuckyDice extends ColoredDice {

    private static final Random RANDOM = new Random();

    public LuckyDice(int side, Color color) {
        super(side, color);
    }

    @Override
    public int roll() {
        int min = (int) (getSide() * 0.70);
        int value;

        do {
            value = RANDOM.nextInt(getSide()) + 1;
        } while (value < min);

        sideValue = value;
        return value;
    }
}