package org.example;



public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player player = new Player();
        deck.shuffleDeck();

        player.drawCard(deck);
        player.drawCard(deck);

        player.printHand();
        player.getValue();






    }
}