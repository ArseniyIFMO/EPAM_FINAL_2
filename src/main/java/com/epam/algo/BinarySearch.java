package com.epam.algo;

import java.util.ArrayList;

/**
 * This class for binary search
 */
public class BinarySearch {
    /**
     * This function finds position of a given number in sorted array
     *
     * @param toFind - what integer to find
     * @param arr    - array where to find
     * @return position of element, -1 if it doesn't exist
     */
    public static int getPosition(int toFind, ArrayList<Integer> arr) {
        int leftBound = 0;
        int rightBound = arr.size() - 1;
        int lastOk = -1;
        int mid;
        while (leftBound <= rightBound) {
            mid = (leftBound + rightBound) / 2;
            if (arr.get(mid) == toFind) {
                return mid;
            } else {
                if (arr.get(mid) < toFind) {
                    leftBound = mid + 1;
                } else {
                    rightBound = mid - 1;
                }
            }
        }
        return -1;
    }
}
