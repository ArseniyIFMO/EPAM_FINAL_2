package com.epam.arrays;

public class ThirdTaskEx2 {
    /**
     * This function return string which formed from chars in exact strings on possition between left and right
     *
     * @param arr   - array
     * @param row   - from which row we want to form string
     * @param left  - index of left element
     * @param right - index of right element
     * @return string, that formed from that characters
     */
    public static String getStringBetweenPositions(char[][] arr, int row, int left, int right) {
        StringBuilder str = new StringBuilder();
        if (right < left) {
            throw new IllegalArgumentException("Right index is less then left");
        }
        if ((row > arr.length) || (arr[row].length < right)) {
            throw new IllegalArgumentException("Bad index");
        }
        for (int i = left; i <= right; i++) {
            str.append(arr[row][i]);
        }
        return str.toString();
    }
}
