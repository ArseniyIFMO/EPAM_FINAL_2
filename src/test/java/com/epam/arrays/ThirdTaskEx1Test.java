package com.epam.arrays;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class ThirdTaskEx1Test {
    @Test
    public void test1() throws IOException {
        char[][] arr = new char[][]{{'a', 'b', 'c', 'q'}, {'d', 'e', 'f', 'w'}, {'g', 'h', 'i', 'e'}, {'r', 't', 'y', 'z'}};
        assertEquals("a r z q", ThirdTaskEx1.charactersInCorners(arr));
    }
}