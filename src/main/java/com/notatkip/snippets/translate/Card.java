package com.notatkip.snippets.translate;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Card {

    private int index;

    private String name;

    private Map<Locale, String> uprightMeaning;

    private Map<Locale, String> reversedMeaning;


    public int getIndex() {
        return index;
    }


    public void setIndex(int index) {
        this.index = index;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Map<Locale, String> getUprightMeaning() {
        return uprightMeaning;
    }


    public void setUprightMeaning(Map<Locale, String> uprightMeaning) {
        this.uprightMeaning = uprightMeaning;
    }


    public Map<Locale, String> getReversedMeaning() {
        return reversedMeaning;
    }


    public void setReversedMeaning(Map<Locale, String> reversedMeaning) {
        this.reversedMeaning = reversedMeaning;
    }


    public Card() {
    }


    public void translateToPolish() throws Exception {
        Translator translator = new Translator();

        getUprightMeaning().put(new Locale("pl", "pl"), translator.translate(getUprightMeaning().get(Locale.ENGLISH)));
        getReversedMeaning().put(new Locale("pl", "pl"), translator.translate(getReversedMeaning().get(Locale.ENGLISH)));
    }


    public Card(int index, String name, String uprightMeaningEn, String reversedMeaningEn) {
        this.index = index;
        this.name = name;
        uprightMeaning = new HashMap<>();
        uprightMeaning.put(Locale.ENGLISH, uprightMeaningEn);
        reversedMeaning = new HashMap<>();
        reversedMeaning.put(Locale.ENGLISH, reversedMeaningEn);

    }


    public Card(int index, String name, Map<Locale, String> uprightMeaning, Map<Locale, String> reversedMeaning) {
        this.index = index;
        this.name = name;
        this.uprightMeaning = uprightMeaning;
        this.reversedMeaning = reversedMeaning;
    }


    @Override
    public String toString() {
        return "Card [index=" + index + ", name=" + name + ", uprightMeaning=" + uprightMeaning + ", reversedMeaning=" + reversedMeaning + "]";
    }

}
