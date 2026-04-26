package org.example;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Deck {

    private final Random random = new Random();

   private ArrayList<Card> cards;

   public Deck() {
       cards = new ArrayList<>();
       int index = 0;
       for (Card.Suit suit : Card.Suit.values()) {
           for (Card.Rank rank : Card.Rank.values()) {
               cards.add(new Card(suit, rank, index++));
           }
       }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        System.out.println(cards.size());
       for (int i = cards.size()-1; i > 0; i--) {

           int randomi = random.nextInt(i+1);

           Card temp = cards.get(i);
           cards.set(i, cards.get(randomi));
           cards.set(randomi, temp);
       }
    }


    public void resetOrder() {
       cards.sort(Comparator.comparingInt(Card::getOriginal_index));
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
