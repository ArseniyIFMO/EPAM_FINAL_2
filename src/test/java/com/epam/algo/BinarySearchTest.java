package com.epam.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class BinarySearchTest {
    @Test
    public void testGetPosition() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(3, BinarySearch.getPosition(4, array));

        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(0, BinarySearch.getPosition(1, array2));

        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(1, BinarySearch.getPosition(2, array3));

        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(-1, BinarySearch.getPosition(100, array4));

        ArrayList<Integer> array5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(4, BinarySearch.getPosition(5, array5));

        ArrayList<Integer> array6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(9, BinarySearch.getPosition(10, array6));
    }
}
