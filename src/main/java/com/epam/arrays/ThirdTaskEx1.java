package com.epam.arrays;

public class ThirdTaskEx1 {
    /**
     * This method takes array of array of characters and return string that formed from characters in it's  corners
     *
     * @param in - given 2 dimensional array
     * @return string consist of characters in corners
     */
    public static String charactersInCorners(char[][] in) {
        if (in == null) {
            System.out.print("");
        }
        int length = in.length;
        int weight = in[0].length;
        return new String(in[0][0] + " " + in[length - 1][0] + " " + in[length - 1][weight - 1] + " " + in[0][weight - 1]);
    }
}
