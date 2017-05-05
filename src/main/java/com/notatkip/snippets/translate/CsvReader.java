package com.notatkip.snippets.translate;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CsvReader {

    private static final String CSV_FILE_PATH = "/home/user/Pulpit/karty/all - meanings.csv";


    private Optional<Card> lineToObject(String line) {

        String[] a = line.split(";");
        if (a.length != 5) {
            return Optional.empty();
        }

        return Optional.of(new Card(0, a[0], a[2], a[4]));

    }


    public List<Card> obtainCards() throws IOException {
        List<String> lines = readFile();
        return lines.stream().map(l -> lineToObject(l)).filter(f -> f.isPresent()).map(m -> m.get()).collect(Collectors.toList());
    }


    private List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get(CSV_FILE_PATH), Charset.defaultCharset());
    }
}
