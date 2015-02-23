package com.thoughtworks.estructures;

import com.thoughtworks.estructures.utilities.ArrayUtilities;

public class Queue<T> {

    private final ArrayUtilities utilities;
    private Class<T> type;
    private T[] items;
    private int count;

    public Queue(final Class<T> type) {
        this.type = type;
        utilities = new ArrayUtilities<T>(type);
        items = (T[]) utilities.createArrWithCapacity(0);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(final T item) {
        final int capacity = items.length;
        final T[] aux = (T[]) utilities.createArrWithCapacity(capacity + 1);
        utilities.copyAllElements(items, aux);
        aux[count] = item;
        items = aux;
        count++;
    }

    public int size() {
        return count;
    }

    public T pop() {
        final T first = items[0];
        final int capacity = items.length;
        final T[] aux = (T[]) utilities.createArrWithCapacity(capacity - 1);
        copyAllElementsButFirst(items, aux);
        items = aux;
        count --;
        return first;
    }

    private void copyAllElementsButFirst(final T[] source, final T[] target) {
        for (int i = 0; i < target.length; i++) {
            target[i] = source[i + 1];
        }
    }
}