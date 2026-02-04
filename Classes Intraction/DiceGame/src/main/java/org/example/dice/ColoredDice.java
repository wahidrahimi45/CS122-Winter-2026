package org.example.dice;

public class ColoredDice extends Dice {

    private String color;

    public ColoredDice() {
        super();
    }

    public ColoredDice(int side, String color) {
        super(side);
        this.color = color;
    }

    @Override
    public int roll() {
        return super.roll(); // reuse Dice logic
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color + " " + super.toString();
    }
}