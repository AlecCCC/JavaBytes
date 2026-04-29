package org.example;

public class Player {

    private Hand playerHand;
    private boolean standing = false;

    public Player() {
      this.playerHand = new Hand();
    }

    public void drawCard(Deck deck) {
        playerHand.addCard(deck.deal());
    }

    public int getValue(){
        return playerHand.getHandValue();
    }

    public void printHand() {
        for (Card card : playerHand.getCards()) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public boolean isStanding() {
        return standing;
    }

    public void setStanding(boolean standing) {
        this.standing = standing;
    }
}
