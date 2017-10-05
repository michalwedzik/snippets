package com.notatkip.snippets.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.notatkip.tarot.engine.Card;
import com.notatkip.tarot.engine.Deck;

public class CsvConverter {

    public static void main(String[] args) throws IOException {
//        CsvConverter cc = new CsvConverter();
//        cc.obtainCards().forEach(System.out::println);
        Deck deck = new Deck();
        System.out.println(": " + deck.size());

    }

    private static final String CSV_FILE_PATH = "/home/michalwedzik/Pulpit/klucze.csv";


    private Optional<Card> lineToObject(String line) {

        String[] a = line.split(";");
        if (a.length != 5) {
            return Optional.empty();
        }

        return Optional.of(new Card(a[0], "", a[1], a[2], a[3], a[4]));

    }


    public List<String> obtainCards() throws IOException {
        List<String> lines = readFile();
        return lines.stream().map(l -> lineToObject(l)).filter(f -> f.isPresent()).map(m -> m.get().toJavaString()).collect(Collectors.toList());
    }


    private List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get(CSV_FILE_PATH), Charset.defaultCharset());
    }

}
