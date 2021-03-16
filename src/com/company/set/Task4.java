package com.company.set;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {

        Set<Purchase> purchases = new HashSet<>();

        purchases.add(new Purchase("Bread", 2));
        purchases.add(new Purchase("Tea", 1));
        purchases.add(new Purchase("Tea", 2));
        purchases.add(new Purchase("Ice cream", 4));
        purchases.add(new Purchase("Ice cream", 8));
        purchases.add(new Purchase("Avokado", 3));

        for (Purchase item : purchases){
            System.out.println(item + "     " + item.hashCode());
        }

    }
}
