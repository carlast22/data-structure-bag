package com.thoughtworks.estructures.utilities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class ArrayUtilitiesTest {

    private int capacity;

    public ArrayUtilitiesTest(int capacity) {
        this.capacity = capacity;
    }

    @Parameters
    public static Collection<Integer[]> arrayParameters() {
        return Arrays.asList(
                new Integer[][]{
                        {0}, //initial state
                        {1}, //simple scenario, a happy one
                        {2}, //this is expected to fail
                        {10} //every scenario
                }
        );
    }

    @Test
    public void shouldCreateAnArrayWithCapacity() {
        ArrayUtilities<Stack> arrayUtilities = new ArrayUtilities<>(Stack.class);
        Stack[] arrWithCapacity = arrayUtilities.createArrWithCapacity(capacity);
        assertThat(arrWithCapacity.length, is(capacity));
    }
}