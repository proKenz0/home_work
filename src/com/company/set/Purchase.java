package com.company.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Purchase implements Comparable<Purchase>{
    private String name;
    private int number;

    public Purchase(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static Set<Purchase> generatePurchases(){
        Set<Purchase> purchases = new HashSet<>();
        purchases.add(new Purchase("Bread", 2));
        purchases.add(new Purchase("Tea", 1));
        purchases.add(new Purchase("Tea", 2));
        purchases.add(new Purchase("Ice cream", 4));
        purchases.add(new Purchase("Ice cream", 8));
        purchases.add(new Purchase("Avokado", 3));
        return purchases;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(name, purchase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Purchase o) {
        return this.name.compareTo(o.getName());
    }
}
