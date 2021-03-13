package com.company.iteratorsComparable;

import com.company.iteratorsComparable.comparators.ProductLengthComparator;
import com.company.iteratorsComparable.comparators.ProductWeightComparator;
import com.company.iteratorsComparable.comparators.ProductWidthComparator;
import com.company.iteratorsComparable.products.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Commodity {
    private List<Product> products;

    public Commodity() {
        products = new ArrayList<>();
    }

    public Commodity(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeProduct(int index) {
        if(index < products.size() && index >= 0)
            products.remove(index);
    }

    public void changeProduct(Product productOld, Product productNew) {
        if (products.contains(productOld))
            products.set(products.indexOf(productOld), productNew);
    }

    public void changeProduct(int index, Product productNew) {
        if(index < products.size() && index >= 0)
            products.set(index, productNew);
    }

    public void sortByName() {
        Collections.sort(products);
    }

    public void sortByLength() {
        Collections.sort(products, new ProductLengthComparator());
    }

    public void sortByWidth() {
        Collections.sort(products, new ProductWidthComparator());
    }

    public void sortByWeight() {
        Collections.sort(products, new ProductWeightComparator());
    }

    public void printProducts(){
        System.out.println("Products: ");

        for(var product : products)
            printProduct(products.indexOf(product));

        System.out.println();
    }

    public void printProduct(int index) {
        if(index < products.size() && index >= 0)
        System.out.println("Name = %s   Length = %d     Width = %d     Weight = %d".formatted(
                products.get(index).getName(), products.get(index).getLength(), products.get(index).getWidth(),
                products.get(index).getWeight()
        ));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = new ArrayList<>(products);
    }
}
