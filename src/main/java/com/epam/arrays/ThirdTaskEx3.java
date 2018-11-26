package com.epam.arrays;

public class ThirdTaskEx3 {
    /**
     * This method return  characters that located on net in 2 dimensional array
     *
     * @param in
     * @return string consist of element on the net
     */
    public static String printCharactersOnNet(char[][] in) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (((i + j) % 2) == 0) {
                    sb.append(in[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
