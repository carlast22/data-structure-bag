package com.thoughtworks.bag;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestBag {

    @Test
    public void shouldStartEmpty() {
        final Bag bag = new Bag();
        final boolean empty = bag.isEmpty();
        assertTrue(empty);
    }

    @Test
    public void shouldNotBeEmptyAfterAddingItem() {
        final Bag<Integer> bag = new Bag<Integer>();
        bag.add(1);
        final boolean empty = bag.isEmpty();
        assertFalse(empty);
    }

    @Test
    public void shouldStartSizeOnZero() {
        final Bag bag = new Bag();
        int size = bag.size();
        assertEquals(0, size);
    }

    @Test
    public void shouldIncrementCounterByOne() {
        final Bag<Integer> bag = new Bag<Integer>();
        bag.add(1);
        final int size = bag.size();
        assertEquals(1, size);
    }

    @Test
    public void shouldIncrementCounterByOnePerItemAdded() {
        final Bag<Integer> bag = new Bag<Integer>();
        bag.add(1);
        bag.add(1);
        final int size = bag.size();
        assertEquals(2, size);
    }

    @Test
    public void shouldContainAddedElements() {
        final Bag<Object> bag = new Bag<Object>();
        bag.add(1);
        bag.add(2);
        final Object[] elements = bag.getElements();
        assertArrayContains(1, elements);
        assertArrayContains(2, elements);
    }

    private void assertArrayContains(final Object expected, final Object[] source) {
        for(int i = 0; i < source.length; i++) {
            if (source[i] == expected) return;
        }
        fail(String.format("<%s> is not present in array", expected));
    }
}