package org.example.dice;

import org.example.enums.Color;

// Always rolls the maximum side value
public class FixedDice extends ColoredDice {

    public FixedDice() {
        super();
    }

    public FixedDice(Color color, int side) {
        super(side, color);
    }

    @Override
    public int roll() {
        sideValue = getSide();
        return sideValue;
    }
}