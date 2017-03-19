package com.notatkip.snippets.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class FunctionExapmle {

    public static void main(String[] args) {

        Map<String, Command> commands = new HashMap<String, Command>();
        commands.put("A", () -> System.out.println("A"));
        commands.put("B", () -> System.out.println("B"));
        commands.put("C", () -> System.out.println("C"));
        commands.get("A").exec();

        Map<String, Consumer<String>> commandsWithParameter = new HashMap<String, Consumer<String>>();
        commandsWithParameter.put("A", (x) -> System.out.println("A parameter: " + x));
        commandsWithParameter.put("B", (x) -> System.out.println("B parameter: " + x));
        commandsWithParameter.put("C", (x) -> System.out.println("C parameter: " + x));
        commandsWithParameter.get("B").accept("hello!");

    }

}
