package com.epam.algo;

import java.util.ArrayList;

public class QuickSort {
    /**
     * Sort elements from start to end positions
     *
     * @param start  - begin of subarray
     * @param end    - end of subarray
     * @param toSort - given array
     */
    private static void doSort(int start, int end, ArrayList<Integer> toSort) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while ((i < cur) && (toSort.get(i) <= toSort.get(cur))) {
                i++;
            }
            while ((j > cur) && (toSort.get(cur) <= toSort.get(j))) {
                j--;
            }
            if (i < j) {
                int temp = toSort.get(i);
                toSort.set(i, toSort.get(j));
                toSort.set(j, temp);
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        doSort(start, cur, toSort);
        doSort(cur + 1, end, toSort);
    }

    /**
     * This function sort array
     *
     * @param toSort - array to sort
     */
    public static ArrayList<Integer> proceed(ArrayList<Integer> toSort) {
        doSort(0, toSort.size() - 1, toSort);
        return toSort;
    }

}
