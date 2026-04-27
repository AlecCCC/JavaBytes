package org.example;

public class Card {

    public enum Suit {DIAMONDS, CLUBS, HEARTS, SPADES}
    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    private Suit suit;
    private Rank rank;
    private int original_index;

    public Card(Suit suit, Rank rank, int original_index) {
        this.suit = suit;
        this.rank = rank;
        this.original_index = original_index;
    }


    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getOriginal_index() {
        return original_index;
    }


    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
