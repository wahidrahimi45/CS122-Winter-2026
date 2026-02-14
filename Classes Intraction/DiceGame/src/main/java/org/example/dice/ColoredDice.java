package org.example.dice;

import org.example.enums.Color;

public class ColoredDice extends Dice {


    //private String color;
    private Color color;

    public ColoredDice() {
        super();
    }

    public ColoredDice(int side, Color color) {
        super(side);
        this.color = color;
    }

    @Override
    public int roll() {
        //return super.roll(); // reuse Dice logic
        int result = getRandom().nextInt(getSide()+ 1);
        this.sideValue = result;
        return result;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color.toString() + " " + super.toString();
    }
}