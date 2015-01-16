package com.thoughtworks.estructures.utilities;

import java.lang.reflect.Array;

public class ArrayUtilities<T> {

    private Class<T> type;

    public ArrayUtilities(Class<T> type) {
        this.type = type;
    }

    public T[] createArrWithCapacity(int capacity) {
        return (T[]) Array.newInstance(type, capacity);
    }
}
