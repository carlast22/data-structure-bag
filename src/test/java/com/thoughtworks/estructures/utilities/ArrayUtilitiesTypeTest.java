package com.thoughtworks.estructures.utilities;

import com.thoughtworks.estructures.Bag;
import com.thoughtworks.estructures.Queue;
import com.thoughtworks.estructures.Stack;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ArrayUtilitiesTypeTest {

    private Class type;

    public ArrayUtilitiesTypeTest(Class type) {
        this.type = type;
    }

    @Parameters
    public static Collection<Class[]> arrayParameters() {
        return Arrays.asList(
                new Class[][] {
                        {Stack.class},
                        {Queue.class},
                        {Bag.class}
                }
        );
    }

    @Test
    public void shouldCreateAnArrayOfElementsOfGivenType() {
        int capacity = 1;
        ArrayUtilities<Object> arrayUtilities = new ArrayUtilities<>(type);
        Object[] arrWithCapacity = arrayUtilities.createArrWithCapacity(capacity);
        assertEquals(type, arrWithCapacity.getClass().getComponentType());
    }
}
