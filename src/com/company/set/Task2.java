package com.company.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Set<Purchase> purchases = new LinkedHashSet<>();

        purchases.add(new Purchase("Bread", 2));
        purchases.add(new Purchase("Tea", 1));
        purchases.add(new Purchase("Tea", 2));
        purchases.add(new Purchase("Ice cream", 4));
        purchases.add(new Purchase("Ice cream", 8));
        purchases.add(new Purchase("Avokado", 3));

        for(Purchase purchase : purchases)
            System.out.println(purchase);
    }
}
