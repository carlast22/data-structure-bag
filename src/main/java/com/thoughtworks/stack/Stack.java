package com.thoughtworks.stack;

import java.lang.reflect.Array;

public class Stack<T> {

    private Class<T> type;
    private int count;
    private T[] items;

    public Stack(final Class<T> type) {
        this.type = type;
        items = createArrWithCapacityIncreasedByOne(0);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void add(T item) {
        final int capacity = items.length;
        final T[] aux = createArrWithCapacityIncreasedByOne(capacity);
        copyAllElements(items, aux);
        aux[count] = item;
        items = aux;
        count ++;
    }

    private T[] createArrWithCapacityIncreasedByOne(final int capacity) {
        final int newCapacity = capacity + 1;
        final T[] tsArr = (T[]) Array.newInstance(type, newCapacity);
        return tsArr;
    }

    private void copyAllElements(final T[] source, final T[] target) {
        for(int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }
}
