package com.thoughtworks.estructures;
import com.thoughtworks.estructures.utilities.ArrayUtilities;

public class Stack<T> {

    private Class<T> type;
    private int count;
    private T[] items;
    private final ArrayUtilities utilities;

    public Stack(final Class<T> type) {
        this.type = type;
        utilities = new ArrayUtilities<T>(type);
        items = (T[]) utilities.createArrWithCapacity(0);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void add(T item) {
        final int capacity = items.length;
        final T[] aux = (T[]) utilities.createArrWithCapacity(capacity + 1);
        utilities.copyAllElements(items, aux);
        aux[count] = item;
        items = aux;
        count ++;
    }

    public T pop() {
        final T last = items[items.length - 1];
        final int capacity = items.length;
        final T[] aux = (T[]) utilities.createArrWithCapacity(capacity - 1);
        copyAllElementsButLast(items, aux);
        items = aux;
        count --;
        return last;
    }

    private void copyAllElementsButLast(T[] source, T[] target) {
        for(int i = 0; i < target.length; i++) {
            target[i] = source[i];
        }
    }
}