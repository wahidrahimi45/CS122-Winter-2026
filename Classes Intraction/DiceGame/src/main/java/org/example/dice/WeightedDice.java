package org.example.dice;

import java.util.Random;

public class WeightedDice extends Dice{
    public WeightedDice(int side)
    {
        super(side);
    }

    public int roll()
    {
        Random random = new Random();
        int value1 = random.nextInt(1, this.getSide()+1);
        int value2 = random.nextInt(1, this.getSide()+1);
        int max = 0;
        if(value1 > value2)
        {
            max = value1;
        }
        else {
            max = value2;
        }
        this.sideValue = max;

        System.out.println("Rolled a "+ this.getSide()+" sided dice and got: "+max );
        return max;
    }
}
