package com.notatkip.snippets.translate;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TranslateMe {

    private static final String OUTPUT_FILE_PATH = "/home/user/Pulpit/karty/output2.txt";


    public static void main(String... args) throws Exception {

        CsvReader cr = new CsvReader();
        List<Card> cards = cr.obtainCards();

        cards.forEach(c -> {
            try {
                c.translateToPolish();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        Files.write(Paths.get(OUTPUT_FILE_PATH), cards.stream().map(c -> c.toString()).collect(Collectors.toList()), Charset.defaultCharset());
        System.out.println("finish");
    }
}