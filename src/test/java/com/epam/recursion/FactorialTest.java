package com.epam.recursion;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {
    @Test
    public void testZeroFactorial() throws IOException {
        assertEquals(1, Factorial.evaluate(0));
    }

    @Test
    public void test2() throws IOException {
        assertEquals(1, Factorial.evaluate(1));
    }

    @Test
    public void test3() throws IOException {
        assertEquals(6, Factorial.evaluate(3));
    }
}
