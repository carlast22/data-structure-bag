package com.thoughtworks.estructures;

import com.thoughtworks.estructures.utilities.ArrayUtilities;

public class Bag<T> {

    private final Class<T> type;
    private T[] items;
    private int count;
    private final ArrayUtilities<T> utilities;

    public Bag(final Class<T> type) {
        this.type = type;
        utilities = new ArrayUtilities<>(type);
        items = utilities.createArrWithCapacity(0);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(final T item) {
        final int capacity = items.length;
        final T[] aux = utilities.createArrWithCapacity(capacity + 1);
        copyElements(items, aux);
        aux[count] = item;
        items = aux;
        count++;
    }

    public int size() {
        return count;
    }

    public T[] getElements() {
        return items;
    }

    private void copyElements(final T[] source, final T[] target) {
        for(int i =0; i<source.length; i++) {
            target[i] = source[i];
        }
    }
}

