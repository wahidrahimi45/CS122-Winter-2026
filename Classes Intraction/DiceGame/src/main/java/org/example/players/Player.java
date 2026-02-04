package org.example.players;

import org.example.dice.ColoredDice;
import org.example.dice.Dice;

public class Player {
    private String name;
    private int score;
    private Dice dice; // Has-a relationship



    // Constructors
    public Player()
    {
        this.name = "Unknown Name";
        this.dice = new Dice(6);
    }
    public Player(String name, Dice dice)
    {
        this.name = name;
        this.dice = dice;
    }


    //Method
    public int play()
    {
        System.out.print(this.name+" ");
        int value = this.dice.roll();
        this.score = this.score + value;
        return value;
    }
    public void play(int round)
    {
        for (int i = 0; i < round; i++) {
            int value = this.dice.roll();
            System.out.println(this.getName()+" Rolled a "+ dice.getSide()+" sided dice and got "+ value);
            this.score = this.score + value;
        }
    }

    // Getter
    public int getScore()
    {
        return this.score;
    }
    public String getName()
    {
        return this.name;
    }
}
