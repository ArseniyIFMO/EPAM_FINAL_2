package com.epam.algo;

import java.util.ArrayList;
import java.util.*;


public class RadixSort {

    private static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    /**
     * This function proceed countsort
     **/
    private static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    private static int[] radixsort(int arr[], int n) {
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
        return arr;
    }

    /**
     * this function proceed radix sort of given array
     *
     * @param toSort - given array
     * @return sorted aray via radix sort
     **/
    public static ArrayList<Integer> proceed(ArrayList<Integer> toSort) {
        int[] arr = new int[toSort.size()];
        for (int i = 0; i < toSort.size(); i++) {
            arr[i] = toSort.get(i);
        }
        radixsort(arr, toSort.size());
        ArrayList<Integer> toReturn = new ArrayList<>();
        for (int i = 0; i < toSort.size(); i++) {
            toReturn.add(arr[i]);
        }
        return toReturn;
    }
}
