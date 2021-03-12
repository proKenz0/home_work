package com.company.iteratorsComparable.comparators;

import com.company.iteratorsComparable.products.Product;

import java.util.Comparator;

public class ProductWidthComparator  implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getWidth() > o2.getWidth())
            return 1;
        else if(o1.getWidth() < o2.getWidth())
            return -1;
        return 0;
    }
}
