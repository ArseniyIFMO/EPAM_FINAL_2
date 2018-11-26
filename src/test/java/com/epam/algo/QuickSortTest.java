package com.epam.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class QuickSortTest {
    @Test
    public void testProceed() {
        ArrayList<Integer> toSort = new ArrayList<>(Arrays.asList(1, 2, 121, 1, 1));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 121));
        assertEquals(expectedResult, QuickSort.proceed(toSort));

        ArrayList<Integer> toSort2 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expectedResult2 = new ArrayList<>(Arrays.asList(1));
        assertEquals(expectedResult, QuickSort.proceed(toSort));

        ArrayList<Integer> toSort3 = new ArrayList<>(Arrays.asList(5, 1, 2, 4, 3));
        ArrayList<Integer> expectedResult3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expectedResult, QuickSort.proceed(toSort));
    }
}
