package org.example.dice;

import java.util.Random;

public class Dice {
    private int side;
    private int sideValue;
    private final int[] accecptedSides = {6,8,10,16,20};

    // Constructors
    public Dice()
    {
        this.side = 6;
    }
    public Dice(int side)
    {
        boolean found = false;
        for (int i = 0; i < accecptedSides.length; i++) {
            if(accecptedSides[i] == side)
            {
                this.side = side;
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Invalid side. set to a default six sided dice");
            this.side = 6;
        }

    }

    // Methods
    public int roll()
    {
        Random random = new Random();
        int value = random.nextInt(1, this.side+1);
        this.sideValue = value;
        System.out.println("Rolled a "+ this.getSide()+" sided dice and got: "+ value);
        return value;
    }
    public int roll10Times()
    {
        int result = 0;
        for (int i = 0; i <10; i++) {
            int value = roll();
            result += value;
            System.out.println("Rolled a "+ this.getSide()+" sided dice and got "+ value);
        }
        return result;
    }

    // Getter
    public int getSide() {
        return side;
    }

    public int getSideValue() {
        return sideValue;
    }

    @Override
    public String toString()
    {
        return this.side+" sided dice";
    }
}
