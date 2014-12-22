package com.thoughtworks.estructures;

public class CustomType {

    private final int value;

    public CustomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomType that = (CustomType) o;

        if (value != that.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "CustomType{" +
                "value=" + value +
                '}';
    }
}
