package com.thoughtworks.estructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BagTest {

    @Test
    public void shouldStartEmpty() {
        final Bag bag = new Bag(CustomType.class);
        final boolean empty = bag.isEmpty();
        assertTrue(empty);
    }

    @Test
    public void shouldNotBeEmptyAfterAddingItem() {
        final Bag<Integer> bag = new Bag<Integer>(Integer.class);
        bag.add(1);
        final boolean empty = bag.isEmpty();
        assertFalse(empty);
    }

    @Test
    public void shouldStartSizeOnZero() {
        final Bag<Integer> bag = new Bag(Integer.class);
        int size = bag.size();
        assertEquals(0, size);
    }

    @Test
    public void shouldIncrementCounterByOne() {
        final Bag<Integer> bag = new Bag<Integer>(Integer.class);
        bag.add(1);
        final int size = bag.size();
        assertEquals(1, size);
    }

    @Test
    public void shouldIncrementCounterByOnePerItemAdded() {
        final Bag<Integer> bag = new Bag<Integer>(Integer.class);
        bag.add(1);
        bag.add(1);
        final int size = bag.size();
        assertEquals(2, size);
    }

    @Test
    public void shouldContainAddedElements() {
        final Bag<Object> bag = new Bag<Object>(Object.class);
        bag.add(1);
        bag.add(2);
        final Object[] elements = bag.getElements();
        assertArrayContains(1, elements);
        assertArrayContains(2, elements);
    }

    @Test
    public void shouldAddCustomTypes() {
        final Bag<CustomType> bag = new Bag<CustomType>(CustomType.class);
        bag.add(new CustomType(1));
        bag.add(new CustomType(2));
        final CustomType[] elements = bag.getElements();
        assertArrayContains(new CustomType(1), elements);
        assertArrayContains(new CustomType(2), elements);
    }

    private <T> void assertArrayContains(final T expected, final T[] bag) {
        for (T item : bag) {
            if (expected.equals(item)) return;
        }
        fail(String.format("<%s> is not present in array <%s>", expected, bag));
    }
}