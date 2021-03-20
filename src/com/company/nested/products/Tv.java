package com.company.nested.products;

public class Tv extends Product {
    private String brand;

    public Tv(String name, int length, int width, int weight) {
        super(name, length, width, weight);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
