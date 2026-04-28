package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        Player player = new Player();

        boolean gamePlaying = true;
        Scanner scanner = new Scanner(System.in);

        while (gamePlaying){

            System.out.println("Welcome to black.\nReady to play?");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {

                dealer.drawCard(deck);
                player.drawCard(deck);
                dealer.drawCard(deck);
                player.drawCard(deck);

                dealer.printHand();





            }

            else {
                System.exit(0);
            }


        }







    }
}