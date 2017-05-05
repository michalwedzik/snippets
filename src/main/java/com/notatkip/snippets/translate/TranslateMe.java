package com.notatkip.snippets.translate;

import java.util.List;

public class TranslateMe {

    public static void main(String... args) throws Exception {

        CsvReader cr = new CsvReader();
        List<Card> cards = cr.obtainCards();

        cards.get(0).translateToPolish();
        cards.get(1).translateToPolish();

        System.out.println(cards.get(0));
        System.out.println(cards.get(1));

    }

}