package org.example;

public class Dealer extends Player{

    public void showCardUp(){
        System.out.println("Dealer is showing: " + getPlayerHand().getCards().getFirst());
    }

    public void getCardUpValue() {
        System.out.println("Dealer's Value is " + getPlayerHand().getCards().getFirst().getValue());
    }


}
