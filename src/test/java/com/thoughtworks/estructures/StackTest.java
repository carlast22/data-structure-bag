package com.thoughtworks.estructures;

import com.thoughtworks.estructures.Stack;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StackTest {

    @Test
    public void shouldStartEmpty() {
        final Stack stack = new Stack<Integer>(Integer.class);
        final boolean empty = stack.isEmpty();
        assertThat(empty, is(true));
    }

    @Test
    public void shouldStartSizeOnZero() {
        final Stack stack = new Stack<Integer>(Integer.class);
        int size = stack.size();
        assertThat(size, is(0));
    }

    @Test
    public void shouldNotBeEmptyAfterAddingAnItem() {
        final Stack stack = new Stack<Integer>(Integer.class);
        stack.add(1);
        final boolean empty = stack.isEmpty();
        assertThat(empty, is(false));
    }

    @Test
    public void shouldAddAnotherItem() {
        final Stack stack = new Stack<Integer>(Integer.class);
        stack.add(1);
        stack.add(2);
        final int lenght = stack.size();
        assertThat(lenght, is(2));
    }

    @Test
    public void shouldRemoveTheLastAddedElement() {
        final Stack stack = new Stack<Integer>(Integer.class);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.pop();
        final int length = stack.size();
        assertThat(length, is(2));
    }
}
