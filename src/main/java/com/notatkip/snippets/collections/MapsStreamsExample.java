package com.notatkip.snippets.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapsStreamsExample {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value11");
        map.put("key2", "value11");
        map.put("key3", "value22");
        map.put("key4", "value33");

        Map<String, String> map2 = map.entrySet().stream()
                .filter(f -> "value11".equals(f.getValue()))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        
        map2.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        System.out.println("--------");
        
        Entry<String, String> s = map.entrySet().stream()
            .filter(f -> "value11".equals(f.getValue()))
            .findFirst().orElseThrow(() -> new NullPointerException());
        
       System.out.println(s.getKey());
       System.out.println("--------");
       
       map.entrySet().stream()
           .filter(f -> "key5".equals(f.getValue()))
           .findFirst().orElseThrow(() -> new NullPointerException());
    }
}
