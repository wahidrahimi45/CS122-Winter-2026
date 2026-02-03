package org.example;

import org.example.dice.ColoredDice;
import org.example.dice.Dice;
import org.example.dice.WeightedDice;
import org.example.players.Player;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Dice sixSidedDice = new Dice(6);
        //Dice sixSidedDice2 = new Dice(6);
        final int side = 20;
        WeightedDice weightedDice = new WeightedDice(side);
        ColoredDice coloredDice = new ColoredDice(side,"Red");

        Player john = new Player("John", weightedDice);
        Player alex = new Player("Alex", coloredDice);

        john.play(10);
        System.out.println("-----------------------------");
        alex.play(10);

        System.out.println("John Score: "+ john.getScore());
        System.out.println("Alex Score: "+ alex.getScore());

        announceTheWinner(john, alex);


    }

    public static void announceTheWinner(Player player1, Player player2)
    {
        if(player1.getScore() > player2.getScore())
        {
            System.out.println(player1.getName()+" is the winner");
        }
        else {
            System.out.println(player2.getName()+" is the winner");
        }
    }
}