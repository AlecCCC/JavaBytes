package org.example;

import java.util.ArrayList;
import java.util.List;

public class Deck {

   private List<Card> cards;

   public Deck() {
       cards = new ArrayList<>();
       for (Card.Suit suit : Card.Suit.values()) {
           for (Card.Rank rank : Card.Rank.values()) {
               cards.add(new Card(suit, rank));
           }
       }
    }

    public List<Card> getCards() {
        return cards;
    }
}
