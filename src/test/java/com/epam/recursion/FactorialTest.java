package com.epam.recursion;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {
    @Test
    public void testEvaluate() throws IOException {
        assertEquals(1, Factorial.evaluate(0));

        assertEquals(1, Factorial.evaluate(1));

        assertEquals(6, Factorial.evaluate(3));
    }
}
