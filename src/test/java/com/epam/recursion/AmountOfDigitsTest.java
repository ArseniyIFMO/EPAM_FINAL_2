package com.epam.recursion;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class AmountOfDigitsTest {
    @Test
    public void testEvaluate() throws IOException {
        assertEquals(1, AmountOfDigits.evaluate(0));

        assertEquals(1, AmountOfDigits.evaluate(9));

        assertEquals(3, AmountOfDigits.evaluate(123));
    }
}
