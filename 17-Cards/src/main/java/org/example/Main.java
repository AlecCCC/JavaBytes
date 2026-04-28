package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Dealer dealer = new Dealer();
        Player player = new Player();

        boolean gamePlaying = true;
        Scanner scanner = new Scanner(System.in);

        while (gamePlaying){

            System.out.println("Welcome to blackjack.\nReady to play?");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {

                Deck gameDeck = new Deck();
                dealer.getPlayerHand().clearHand();
                player.getPlayerHand().clearHand();

                for (int i = 0; i < 2; i++) {
                    dealer.drawCard(gameDeck);
                    player.drawCard(gameDeck);
                }

                System.out.println("DEALER HAND");

                dealer.showCardUp();
                dealer.getCardUpValue();
                System.out.println("------");
                System.out.println("PLAYER HAND");
                player.printHand();
                System.out.printf("Player's Value is: %d ", player.getValue());

                System.out.println("What would like the player do?\n1. Hit\n2. Stay");







            }

            else {
                System.exit(0);
            }


        }







    }
}