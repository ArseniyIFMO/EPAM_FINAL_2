package com.epam.arrays;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class ThirdTaskEx5Test {
    @Test
    public void testPrintSymbolsOnOddPossitions() throws IOException {
        String ans = ThirdTaskEx5.printSymbolsOnOddPossitions(new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}});
        assertEquals("beh", ans);
    }
}
