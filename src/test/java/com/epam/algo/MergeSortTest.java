package com.epam.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class MergeSortTest {
    @Test
    public void testProceed() {
        ArrayList<Integer> toSort = new ArrayList<>(Arrays.asList(1, 2, 121, 1, 1));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 121));
        assertEquals(MergeSort.proceed(toSort), expectedResult);

        ArrayList<Integer> toSort2 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expectedResult2 = new ArrayList<>(Arrays.asList(1));
        assertEquals(MergeSort.proceed(toSort2), expectedResult2);

        ArrayList<Integer> toSort3 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<Integer> expectedResult3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(MergeSort.proceed(toSort3), expectedResult3);

        ArrayList<Integer> toSort4 = new ArrayList<>(Arrays.asList(2, 1));
        ArrayList<Integer> expectedResult4 = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(MergeSort.proceed(toSort4), expectedResult4);
    }
}