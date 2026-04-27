package org.example;



public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();


        System.out.println("SHUFFLE");
        deck.shuffleDeck();

        deck.printDeck();

        System.out.println("REORDER");
        deck.reOrder();
        deck.printDeck();




    }
}