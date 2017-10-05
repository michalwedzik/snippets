package com.notatkip.tarot.engine;

import java.util.Random;

public class CardHandler {

    private Deck deck = new Deck();


    public Deck getShuffledDeck() {
        shuffle();
        return deck;
    }


    public Card cardOfTheDay() {
        Integer numberOfCard = new Random().nextInt(78);
        shuffle();
        return deck.getCard(numberOfCard);
    }


    private void shuffle() {
        deck.shuffleDeck();
        deck.shuffleDeckSecondMethod();
    }

}
