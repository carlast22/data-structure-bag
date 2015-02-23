package com.thoughtworks.estructures.utilities;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ArrayUtilitiesTest {

    public Integer[][] parametersForShouldCreateAnArrayWithCapacity() {
        return  new Integer[][]{
                        {1}, //simple scenario, a happy one
                        {2}, //this is expected to fail
                        {10} //every scenario
                };
    }

    @Test
    @Parameters
    public void shouldCreateAnArrayWithCapacity(Integer capacity) {
        ArrayUtilities<Stack> arrayUtilities = new ArrayUtilities<>(Stack.class);
        Stack[] arrWithCapacity = arrayUtilities.createArrWithCapacity(capacity);
        assertThat(arrWithCapacity.length, is(capacity));
    }

    @Test
    public void shouldCopyAllTheElements() {
        Integer capacity = 2;
        ArrayUtilities<Stack> arrayUtilities = new ArrayUtilities<>(Stack.class);
        Stack[] source = arrayUtilities.createArrWithCapacity(capacity);
        Stack[] target = arrayUtilities.createArrWithCapacity(capacity);
        Stack[] copy = arrayUtilities.copyAllElements(source, target);
        assertThat(target.length, is(copy.length));
    }
}