package com.thoughtworks.queue;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
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

    @Test
    public void shouldAddAnotherItem() {
        final Queue<Integer> queue = new Queue<Integer>(Integer.class);
        queue.add(1);
        queue.add(2);
        final int lenght = queue.size();
        assertThat(lenght, is(2));
    }

    @Test
    public void shouldRemoveTheItemInTheQueue() {
        final Queue<Integer> queue = new Queue<Integer>(Integer.class);
        queue.add(1);
        queue.pop();
        final int lenght = queue.size();
        assertThat(lenght, is(0));
    }
}
