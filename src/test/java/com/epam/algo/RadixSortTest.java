package com.epam.algo;

import org.junit.Test;

import java.util.ArrayList;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class RadixSortTest {
    @Test
    public void testProceed() {
        ArrayList<Integer> toSort = new ArrayList<>(Arrays.asList(1, 3, 2, 432, 22, 13213));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 2, 3, 22, 432, 13213));
        assertEquals(expectedResult, RadixSort.proceed(toSort));

        ArrayList<Integer> toSort2 = new ArrayList<>(Arrays.asList(1, 2, 121, 1, 1));
        ArrayList<Integer> expectedResult2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 121));
        assertEquals(expectedResult2, RadixSort.proceed(toSort2));

        ArrayList<Integer> toSort3 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expectedResult3 = new ArrayList<>(Arrays.asList(1));
        assertEquals(expectedResult3, RadixSort.proceed(toSort3));

        ArrayList<Integer> toSort4 = new ArrayList<>(Arrays.asList(5, 1, 2, 4, 3));
        ArrayList<Integer> expectedResult4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expectedResult4, RadixSort.proceed(toSort4));
    }
}
