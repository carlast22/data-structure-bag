package com.thoughtworks.queue;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    @Test
    public void shouldStartEmpty() {
        final Queue queue = new Queue<Integer>(Integer.class);
        final boolean empty = queue.isEmpty();
        assertTrue(empty);
    }

    @Test
    public void shouldNotBeEmptyAfterAddingItem() {
        final Queue<Integer> queue = new Queue<Integer>(Integer.class);
        queue.add(1);
        final boolean empty = queue.isEmpty();
        assertFalse(empty);
    }
}
