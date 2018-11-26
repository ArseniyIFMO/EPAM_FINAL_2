package com.epam.arrays;

public class ThirdTaskEx4 {
    /**
     * Method print symbols on even possition of every string
     *
     * @param x - given matrix
     * @return - string consist of that elements
     */
    public static String printSymbolsOnEvenPossitions(char[][] x) {
        StringBuffer sb = new StringBuffer();
        if (x == null) {
            System.out.print("Null pointer");
            return null;
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (j % 2 == 0) {
                    sb.append(x[i][j]);
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
