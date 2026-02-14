package org.example.dice;

public class StandardDice extends Dice{

    public StandardDice(int side) {
        super(side);
    }

    @Override
    public int roll() {
        return getRandom().nextInt(getSide()+1);
    }
}
