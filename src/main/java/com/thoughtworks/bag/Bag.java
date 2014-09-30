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
        final int capacity = items.length;
        final int[] aux = createArrWithCapacityIncreasedByOne(capacity);
        copyElements(items, aux);
        aux[count] = item;
        items = aux;
        count++;
    }

    public int size() {
        return count;
    }

    private int[] createArrWithCapacityIncreasedByOne(final int capacity) {
        final int newCapacity = capacity + 1;
        final int [] aux = new int[newCapacity];
        return aux;
    }

    private void copyElements(final int[] source, final int[] target) {
        for(int i =0; i<source.length; i++) {
            target[i] = source[i];
        }
    }
}
