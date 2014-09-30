package com.thoughtworks.bag;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestBag {

    @Test
    public void shouldStartEmpty() {
        final Bag bag = new Bag();
        final boolean empty = bag.isEmpty();
        assertTrue(empty);
    }

    @Test
    public void shouldNotBeEmptyAfterAddingItem() {
        final Bag bag = new Bag();
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
        final Bag bag = new Bag();
        bag.add(1);
        final int size = bag.size();
        assertEquals(1, size);
    }

    @Test
    public void shouldIncrementCounterByOnePerItemAdded() {
        final Bag bag = new Bag();
        bag.add(1);
        bag.add(1);
        final int size = bag.size();
        assertEquals(2, size);
    }
}