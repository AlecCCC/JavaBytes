package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();

    Random random = new Random();


    public Deck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void printDeck() {
        for (Card tempCard : cards) {
            System.out.println(tempCard.getRank() + " of " + tempCard.getSuit());
        }
    }

    public void shuffleDeck() {
        for (int i = cards.size() - 1; i > 0; i-- ) {

            int j = random.nextInt(i + 1);
            Card temp = cards.get(i);

            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public void reOrder() {
        cards.sort(Comparator.comparing((Card card) -> card.getSuit().ordinal())
                .thenComparing(card -> card.getRank().ordinal()));
    }


    public ArrayList<Card> getCards() {
        return cards;
    }
}
