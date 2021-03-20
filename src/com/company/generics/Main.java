package com.company.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MyEntry<String, Integer> map = new MyEntry<>(new HashMap<>());

        map.add("one", 1);
        map.add("two", 2);
        map.add("three", 3);

        map.printMap();

        System.out.println();

        map.remove("one");
        map.removeByValue(3);

        map.printKeys();
        map.printValues();
        map.printMap();
        
    }
}
