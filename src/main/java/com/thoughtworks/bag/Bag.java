package com.thoughtworks.bag;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private List<Integer> items;
    private int count;

    public Bag() {
        items = new ArrayList<Integer>();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(final int item) {
        items.add(item);
        count++;
    }

    public int size() {
        return count;
    }
}
