package com.notatkip.tarot.engine;

public class Card {

    private boolean uprightPosition = true;

    private String index;

    private String code;

    private String nameEn;

    private String namePl;

    private String descriptionEn;

    private String descriptionPl;


    public String toJavaString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cards.add(new Card(\"");
        sb.append(index);
        sb.append("\",\"");
        sb.append(nameEn);
        sb.append("\",\"");
        sb.append(namePl);
        sb.append("\",\"");
        sb.append(descriptionEn);
        sb.append("\",\"");
        sb.append(descriptionPl);
        sb.append("\"));");
        return sb.toString();
    }


    public Card(String index, String code, String nameEn, String namePl, String descriptionEn, String descriptionPl) {
        this.index = index;
        this.code = code;
        this.nameEn = nameEn;
        this.namePl = namePl;
        this.descriptionEn = descriptionEn;
        this.descriptionPl = descriptionPl;
    }


    @Override
    public String toString() {
        return "Card [" + code + "]";
    }


    public boolean isUprightPosition() {
        return uprightPosition;
    }


    public void setUprightPosition(boolean uprightPosition) {
        this.uprightPosition = uprightPosition;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getNameEn() {
        return nameEn;
    }


    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }


    public String getDescriptionPl() {
        return descriptionPl;
    }


    public void setDescriptionPl(String descriptionPl) {
        this.descriptionPl = descriptionPl;
    }


    public String getNamePl() {
        return namePl;
    }


    public void setNamePl(String namePl) {
        this.namePl = namePl;
    }


    public String getDescriptionEn() {
        return descriptionEn;
    }


    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

}
