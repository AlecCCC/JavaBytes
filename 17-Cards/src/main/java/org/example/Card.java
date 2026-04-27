package org.example;

public class Card {

    public enum Suit {DIAMONDS, CLUBS, HEARTS, SPADES}
    public enum Rank {ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

        private final int value;

        Rank(int value) {
            this.value = value;
        }
    }

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
