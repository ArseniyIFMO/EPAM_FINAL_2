package com.epam.recursion;

public class SumOfDigits {
    /**
     * This function calculate sum of digits
     *
     * @param x - variable, that we want to know sum of digits
     * @return sum of digits in x
     */
    public static int evaluate(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        } else if (x < 10) {
            return x;
        } else {
            return x % 10 + evaluate(x / 10);
        }
    }
}
