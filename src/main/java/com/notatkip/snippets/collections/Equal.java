package com.notatkip.snippets.collections;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class Equal {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("ala", "ma", "kota");
        List<String> list2 = Arrays.asList("ala", "ma", "kota");
        System.out.println(CollectionUtils.isEqualCollection(list1, list2)); // true

        List<String> list3 = Arrays.asList("ala", "ma", "kota");
        List<String> list4 = Arrays.asList("ma", "ala", "kota");
        System.out.println(CollectionUtils.isEqualCollection(list3, list4)); // true

        List<String> list5 = Arrays.asList("ala", "ma", "kota");
        List<String> list6 = Arrays.asList("ala", "ma", "kota", "i", "psa");
        System.out.println(CollectionUtils.isEqualCollection(list5, list6)); // false

        List<String> list7 = Arrays.asList("ala", "ma", "kota");
        List<String> list8 = Arrays.asList("ala", "ma", "koty");
        System.out.println(CollectionUtils.isEqualCollection(list7, list8)); // false
    }
}
