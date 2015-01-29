package com.thoughtworks.estructures.utilities;

import org.junit.Test;

public class ArrayUtilitiesExceptionTest {

    @Test(expected = ArrayUtilitiesException.class)
    public void shouldThrowExceptionIfCapacityIsNegativeNumber() {
        final ArrayUtilities<String> utilis = new ArrayUtilities<>(String.class);
        utilis.createArrWithCapacity(-1);

    }
}
