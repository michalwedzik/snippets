package com.notatkip.snippets.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListsStreamsExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aabb1");
        list.add("aabb2");
        list.add("bb3");
        list.add("bb4");
        list.add("bb5");

        List<String> list2 = list.stream().filter(s -> s.startsWith("aa")).collect(Collectors.toList());
        list2.forEach(System.out::println);

        System.out.println("--------");

        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Mateusz", 12));
        personsList.add(new Person("Magda", 13));
        personsList.add(new Person("Wojtek", 14));

        List<String> namesList = personsList.stream().map(p -> p.getName()).collect(Collectors.toList());
        namesList.forEach(System.out::println);

    }

}
