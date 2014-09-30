package com.thoughtworks.bag;

public class Bag {

    private int[] items;
    private int count;

    public Bag() {
        items = new int[1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(final int item) {
        items[count] = item;
        count++;
    }

    public int size() {
        return count;
    }
}
