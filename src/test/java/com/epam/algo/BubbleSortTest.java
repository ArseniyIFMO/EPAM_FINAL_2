package com.epam.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class BubbleSortTest {
    @Test
    public void testProceed() {
        ArrayList<Integer> toSort = new ArrayList<>(Arrays.asList(1, 2, 121, 1, 1));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 121));
        assertEquals(BubbleSort.proceed(toSort), expectedResult);

        ArrayList<Integer> toSort2 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expectedResult2 = new ArrayList<>(Arrays.asList(1));
        assertEquals(BubbleSort.proceed(toSort2), expectedResult2);
    }
}
