package org.example.dice;

import java.util.Random;

public class ColoredDice extends Dice{
    private String color;

    public ColoredDice(int side, String color)
    {
        super(side);
        this.color = color;
    }

    public int roll()
    {
        Random random = new Random();
        int value = random.nextInt(1, this.getSide()+1);
        this.sideValue = value;
        System.out.println("Rolled a "+this.color+" "+ this.getSide()+" sided dice and got: "+ value);
        return value;
    }

    public String getColor()
    {
        return this.color;
    }

    public String toString()
    {
        return this.color +" "+ super.toString();
    }
}
