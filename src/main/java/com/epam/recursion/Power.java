package com.epam.recursion;

public class Power {
    /**
     * Functiom that raise x in power y
     *
     * @param x - the base number
     * @param y - power
     * @return x in power y (x^y)
     */
    public static int evaluate(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * evaluate(x, y - 1);
        }
    }
}
