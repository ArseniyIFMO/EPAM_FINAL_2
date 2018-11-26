package com.epam.arrays;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThirdTaskEx4Test {
    @Test
    public void test1() {
        char[][] b = new char[3][];
        b[0] = new char[]{'a', 'b', 'c'};
        b[1] = new char[]{'d', 'e', 'f'};
        b[2] = new char[]{'g', 'h', 'i'};
        assertEquals("ac\ndf\ngi\n", ThirdTaskEx4.printSymbolsOnEvenPossitions(b));
    }
}