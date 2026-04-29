package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Hand playerHand;
    private boolean playerNotStanding = true;

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

    public boolean isPlayerNotStood() {
        return playerNotStanding;
    }

    public void setPlayerStood(boolean playerStood) {
        this.playerNotStanding = !playerStood;
    }
}
