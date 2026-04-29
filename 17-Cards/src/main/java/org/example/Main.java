package org.example;



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Dealer dealer = new Dealer();
        Player player = new Player();

        boolean gamePlaying = true;
        Scanner scanner = new Scanner(System.in);

        while (gamePlaying){

            System.out.println("Welcome to blackjack.\nReady to play? (yes/y or n/no)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {

                Deck gameDeck = new Deck();
                gameDeck.shuffleDeck();
                dealer.getPlayerHand().clearHand();
                player.getPlayerHand().clearHand();
                player.setStanding(false);

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
                System.out.printf("Player's Value is: %d\n", player.getValue());

                while(!player.isStanding() && player.getValue() < 21){

                    System.out.println("What would like the player do?\n1. Hit\n2. Stay");
                    choice = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            player.drawCard(gameDeck);
                            System.out.println("------");
                            System.out.println("PLAYER HAND");
                            player.printHand();
                            System.out.printf("Player's Value is: %d\n", player.getValue());
                            break;
                        case "2":
                            player.setStanding(true);
                    }


                }

                if (player.getValue() > 21) {
                    System.out.println("The player Busts!");
                    continue;
                }


                System.out.println("Dealer's Hand is");
                dealer.printHand();
                System.out.println("Dealer hand value: " + dealer.getValue());
                System.out.println("----------------------");


                while(dealer.getValue() < 17) {

                    System.out.println("DEALING TO DEALER");
                    dealer.drawCard(gameDeck);
                    System.out.println("Dealers Updated Hand:");
                    dealer.printHand();
                    System.out.println("Dealer hand value: " + dealer.getValue());
                    System.out.println("----------------------");
                }

                if (dealer.getValue() > 21) {
                    System.out.println("Dealer Busts, the player wins");
                } else if (dealer.getValue() > player.getValue() && dealer.getValue() < 22) {
                    dealer.printHand();
                    System.out.println("Dealers value of: " + dealer.getValue()
                            + " beats the players hand of " + player.getValue());
                }
                else if (player.getValue() > dealer.getValue()) {
                    System.out.println("Player's " + player.getValue() + " beats Dealer's " + dealer.getValue() + "\n Player Wins!");
                }
                else  if (player.getValue()  == dealer.getValue()) {
                    System.out.println("Tie");
                }


            }

            else {
                System.exit(0);
            }


        }
    }
}