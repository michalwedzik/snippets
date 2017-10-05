package com.notatkip.tarot;

import com.notatkip.tarot.engine.CardHandler;
import com.notatkip.tarot.engine.Deck;

public class Main {

    public static void main(String[] args) {
        CardHandler ch = new CardHandler();

        Deck deck = ch.getShuffledDeck();
        System.out.println(ch.cardOfTheDay().getNamePl());

    }

}
