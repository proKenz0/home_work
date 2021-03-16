package com.company.set;

import java.util.Comparator;

public class PurchaseNumbersDownComparator implements Comparator<Purchase> {

    @Override
    public int compare(Purchase o1, Purchase o2) {
        if(o1.getNumber() > o2.getNumber())
            return -1;
        else if (o1.getNumber() < o2.getNumber())
            return 1;
        return 0;
    }
}
