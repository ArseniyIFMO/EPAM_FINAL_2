package com.epam.arrays;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class ThirdTaskEx2Test {
    @Test
    public void test1() throws IOException {
        char[][] arr = new char[][]{{'a', 'b', 'c', 'q', 'a'}, {'d', 'e', 'f', 'w', 'b'}, {'g', 'h', 'i', 'e', 'c'}, {'r', 't', 'y', 'z', 'd'}, {'r', 't', 'y', 'z', 'd'}};
        assertEquals("ef", ThirdTaskEx2.getStringBetweenPositions(arr, 1, 1, 2));
    }
}