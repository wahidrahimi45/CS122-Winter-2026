package org.example;

import org.example.dice.ColoredDice;
import org.example.dice.Dice;
import org.example.dice.FixedDice;
import org.example.dice.WeightedDice;
import org.example.enums.Color;
import org.example.game.MultiPlayerGame;
import org.example.game.TwoPlayerGame;
import org.example.players.Player;

public class Main {
    public static void main(String[] args) {

        // ===============================
        // GAME CONFIGURATION
        // ===============================
        final int SIDE = 20;   // Number of sides on each dice
        final int ROUND = 10;  // Number of rounds each player plays

        // ===============================
        // CREATE DICE OBJECTS
        // ===============================
        // Each dice object represents a different rolling behavior
        ColoredDice redDice1 = new ColoredDice(SIDE, Color.RED);
        ColoredDice redDice2 = new ColoredDice(SIDE, Color.BLUE);
        FixedDice yellowFixedDice = new FixedDice(Color.YELLOW, SIDE);


        // ===============================
        // CREATE PLAYERS
        // ===============================
        // Each player is assigned a dice
        Player john = new Player("John", redDice2);
        Player alex = new Player("Alex", redDice1);
        Player ahmad = new Player("Ahmad", redDice1);
        Player abdulaziz = new Player("Abdul Aziz", yellowFixedDice);
        Player bhodan = new Player("Bhodan", redDice2);

        // Store all players in an array
        Player[] players = {john, alex, ahmad, abdulaziz, bhodan};

        // ===============================
        // START MULTI-PLAYER GAME
        // ===============================
        MultiPlayerGame game = new MultiPlayerGame(players, ROUND);
        game.playGame();
        game.announceWinner();

    }
}
