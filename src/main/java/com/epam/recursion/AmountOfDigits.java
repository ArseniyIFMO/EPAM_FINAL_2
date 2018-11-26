package com.epam.recursion;

public class AmountOfDigits {
    /**
     * Evaluate amount of digits in integer variable
     *
     * @param x - integer variable
     * @return amount of digits in x
     */
    public static int evaluate(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        } else if (x < 10) {
            return 1;
        } else {
            return evaluate(x / 10) + 1;
        }
    }
}
