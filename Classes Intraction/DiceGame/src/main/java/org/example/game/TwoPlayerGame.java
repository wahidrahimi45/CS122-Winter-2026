package org.example.game;

import org.example.players.Player;

public class TwoPlayerGame {

    private Player player1;
    private Player player2;
    private int round;

    public TwoPlayerGame(Player player1, Player player2, int round) {
        this.player1 = player1;
        this.player2 = player2;
        this.round = round;
    }

    public void playGame() {
        player1.play(round);
        System.out.println("-----------------------------");
        player2.play(round);
    }

    public void announceWinner() {

        System.out.println(player1.getName() + " got score: " + player1.getScore());
        System.out.println(player2.getName() + " got score: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " is the winner");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " is the winner");
        } else { // if both players got the same score
            System.out.println("It's a DRAW!");
        }
    }
}