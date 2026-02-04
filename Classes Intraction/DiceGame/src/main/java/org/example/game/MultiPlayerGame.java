package org.example.game;

import org.example.players.Player;

public class MultiPlayerGame {

    private Player[] players; // List of players
    private int round;        // Number of rounds per player

    public MultiPlayerGame(Player[] players, int round) {
        this.players = players;
        this.round = round;
    }

    // Runs the game for all players
    public void playGame() {

        // Validation check
        if (players == null || players.length < 2) {
            System.out.println("Invalid player list. At least 2 players required.");
            return;
        }

        // Each player plays the game
        for (Player player : players) {
            player.play(round);
            System.out.println("-----------------------");
        }
    }

    // Determines and announces the winner
    public void announceWinner() {

        Player winner = players[0]; // assume the first player is the winner

        // Print all players' scores
        for (Player player : players) {
            System.out.println(player.getName() + " scored: " + player.getScore());
        }

        // Find the player with the highest score
        for (int i = 1; i < players.length; i++) {
            if (players[i].getScore() > winner.getScore()) {
                winner = players[i];
            }
        }

        System.out.println("\nThe winner is: " + winner.getName()
                + " and got: " + winner.getScore());
    }
}