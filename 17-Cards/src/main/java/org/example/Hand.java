package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards = new ArrayList<>();

    public Hand() {
    }

    public int getHandValue(){
        int total = 0;
        int aces = 0;

        for (Card tempCard: cards) {
            total += tempCard.getRank().getValue();
            if (tempCard.getRank() == Card.Rank.ACE) {
                aces++;
            }
        }

        while(total > 11 && aces > 0) {

            total -= 10;
            aces--;

        }

        return total;


    }

    public List<Card> getCards() {
        return cards;
    }



    public void addCard(Card card) {
        cards.add(card);
    }

}
