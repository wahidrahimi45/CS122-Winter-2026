package org.example.dice;

// Always rolls the maximum side value
public class FixedDice extends ColoredDice {

    public FixedDice() {
        super();
    }

    public FixedDice(String color, int side) {
        super(side, color);
    }

    @Override
    public int roll() {
        sideValue = getSide();
        return sideValue;
    }
}