package com.epam.arrays;

public class ThirdTaskEx5 {
    /**
     * This method prynts characters that are on odd position
     *
     * @param x - given array of array of characters
     * @return string consist of that characters
     */
    public static String printSymbolsOnOddPossitions(char[][] x) {
        StringBuffer sb = new StringBuffer();
        if (x == null) {
            System.out.print("Null pointer");
            return null;
        }
        for (int i = 0; i < x[0].length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i % 2 == 1) {
                    sb.append(x[j][i]);
                }
            }
        }
        return sb.toString();
    }
}
