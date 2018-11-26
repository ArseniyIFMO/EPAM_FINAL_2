package com.epam.recursion;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void testEvaluate() throws IOException {
        assertEquals(8, SumOfDigits.evaluate(116));

        assertEquals(11, SumOfDigits.evaluate(56));
    }
}