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
        int length = items.length + 1;
        int [] aux = new int[length];
        for(int i =0; i<items.length; i++) {
           aux[i] = items[i];
        }
        aux[count] = item;
        items = aux;
        count++;
    }

    public int size() {
        return count;
    }
}
