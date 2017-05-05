package com.notatkip.snippets.translate;

import java.util.List;

public class ResponseObject {

    private int code;

    private String lang;

    private List<String> text;


    public int getCode() {
        return code;
    }


    public void setCode(int code) {
        this.code = code;
    }


    public String getLang() {
        return lang;
    }


    public void setLang(String lang) {
        this.lang = lang;
    }


    public List<String> getText() {
        return text;
    }


    public void setText(List<String> text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "ResponseObject [code=" + code + ", lang=" + lang + ", text=" + text + "]";
    }

}
