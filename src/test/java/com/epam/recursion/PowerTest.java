package com.epam.recursion;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class PowerTest {
    @Test
    public void testEvaluate() throws IOException {
        assertEquals(8, Power.evaluate(2, 3));

        assertEquals(9, Power.evaluate(3, 2));

        assertEquals(1, Power.evaluate(5, 0));
    }
}