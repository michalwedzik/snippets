package com.notatkip.snippets.command;

import java.util.HashMap;
import java.util.Map;

public class CommandPattern {

    public static void main(String[] args) {
        Map<String, ConsolePrinter> consolePrinter = new HashMap<String, ConsolePrinter>();

        consolePrinter.put("cat", new CatPrinter());
        consolePrinter.put("dog", new DogPrinter());

        consolePrinter.get("cat").exec();
    }

}
