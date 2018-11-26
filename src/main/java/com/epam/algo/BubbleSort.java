package com.epam.algo;

import java.util.ArrayList;

/**
 * This class provide implementation of bubble sort
 **/
public class BubbleSort {
    /**
     * This function takes list , and sort it by buble sort
     *
     * @param toSort - list we want to sort
     * @return sorted array
     */
    public static ArrayList<Integer> proceed(ArrayList<Integer> toSort) {
        int tmp;
        for (int i = 0; i < toSort.size(); i++) {
            for (int j = 0; j < toSort.size() - i - 1; j++) {
                if (toSort.get(j) > toSort.get(j + 1)) {
                    tmp = toSort.get(j);
                    toSort.set(j, toSort.get(j + 1));
                    toSort.set(j + 1, tmp);
                }
            }
        }
        return toSort;
    }
}
