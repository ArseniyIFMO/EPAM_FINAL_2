package com.epam.arrays;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class ThirdTaskEx3Test {
    @Test
    public void testPrintCharactersOnNet() throws IOException {
        char[][] arr = new char[][]{{'a', 'b', 'c', 'q', 'a'}, {'d', 'e', 'f', 'w', 'b'}, {'g', 'h', 'i', 'e', 'c'}, {'r', 't', 'y', 'z', 'd'}, {'r', 't', 'y', 'z', 'd'}};
        assertEquals("acaewgictzryd", ThirdTaskEx3.printCharactersOnNet(arr));
    }
}
