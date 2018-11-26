package com.epam.algo;

import java.util.ArrayList;

public class MergeSort {
    /**
     * This function makes Mergesort in subarray in given array in subarray [start; end]
     *
     * @param start  - index of starting element
     * @param end    - index of last element
     * @param toSort - array you want to sort
     **/
    private static void doSort(int start, int end, ArrayList<Integer> toSort) {
        if (start == end) {
            return;
        }
        if (start == end - 1) {
            return;
        }
        doSort(start, (start + end) / 2, toSort);
        doSort((start + end) / 2, end, toSort);
        mergeSubArrays(start, (start + end) / 2, end, toSort);
    }

    /**
     * This functtion return given arraylist sorted by mergesort
     *
     * @param toSort - given array to sort
     * @return sorted array
     **/
    public static ArrayList<Integer> proceed(ArrayList<Integer> toSort) {
        doSort(0, toSort.size(), toSort);
        return toSort;
    }

    /**
     * Merge subarray  [leftbound, middlebound) and [middlebound, rightbound)
     *
     * @param leftBound   - left index of first subarray
     * @param middleBound - right index of first subarray
     * @param rightBound  - right index of second subarray
     * @param toStort     - array where you get subarrays to merge
     **/

    private static void mergeSubArrays(int leftBound, int middleBound, int rightBound, ArrayList<Integer> toStort) {
        ArrayList<Integer> toReturn = new ArrayList<>();
        int newLeft = leftBound;
        int newRight = middleBound;
        while ((newLeft != middleBound) || (newRight != rightBound)) {
            if (newLeft == middleBound) {
                toReturn.add(toStort.get(newRight));
                newRight++;
            } else if (newRight == rightBound) {
                toReturn.add(toStort.get(newLeft));
                newLeft++;
            } else {
                if (toStort.get(newLeft) < toStort.get(newRight)) {
                    toReturn.add(toStort.get(newLeft));
                    newLeft++;
                } else {
                    toReturn.add(toStort.get(newRight));
                    newRight++;
                }
            }
        }
        for (int i = 0; i < toReturn.size(); i++) {
            toStort.set(leftBound + i, toReturn.get(i));
        }
    }
}
