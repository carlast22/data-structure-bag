package com.thoughtworks.bag;

public class Bag<T> {

    private T[] items;
    private int count;

    public Bag() {

        items = (T[]) new Object[1];
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
        final T [] aux = (T[]) new Object[newCapacity];
        return aux;
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

