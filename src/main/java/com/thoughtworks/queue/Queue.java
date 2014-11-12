package com.thoughtworks.queue;

import java.lang.reflect.Array;

public class Queue<T> {
    private boolean empty;
    private Class<T> type;
    private T[] items;
    private int count;

    public Queue(final Class<T> type) {
        this.type = type;
        items = createArrWithCapacityIncreasedByOne(0);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(final T item) {
        final int capacity = items.length;
        final T[] aux = createArrWithCapacityIncreasedByOne(capacity);
        copyElements(items, aux);
        aux[count] = item;
        items = aux;
        count++;
    }

    public int size() {
        return count;
    }

    private T[] createArrWithCapacityIncreasedByOne(final int capacity) {
        final int newCapacity = capacity + 1;
        final T[] tsArr = (T[]) Array.newInstance(type, newCapacity);
        return tsArr;
    }

    private void copyElements(final T[] source, final T[] target) {
        for(int i =0; i<source.length; i++) {
            target[i] = source[i];
        }
    }
}
