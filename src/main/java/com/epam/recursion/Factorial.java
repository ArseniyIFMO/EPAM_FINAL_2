package com.epam.recursion;

public class Factorial {
    /**
     * Evaluate factorial of integer variable
     *
     * @param x - integer varialble , which factorial we want to calc
     * @return factorial of x
     */
    public static int evaluate(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        } else if (x == 0) {
            return 1;
        } else if (x == 1) {
            return 1;
        } else {
            return x * evaluate(x - 1);
        }
    }
}
