package com.epam.taskAboutStrings;

import java.util.Scanner;

class StringTask {
    /**
     * This method prints string with all  words reversed in it
     *
     * @param in - initial string
     */
    public static void printAllWordReversed(String in) {
        String[] x = in.split(" ");
        for (int i = 0; i < x.length; i++) {
            for (int j = x[i].length() - 1; j >= 0; j--) {
                System.out.print(x[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    /**
     * This method print last character of a given string
     *
     * @param in - given string
     */
    public static void printLastSymbol(String in) {
        System.out.println("Last symbol is: " + in.charAt(in.length() - 1));
    }

    /**
     * This method print thirs symbol of a given string
     *
     * @param in - given string
     */
    public static void printThirdSymbol(String in) {
        try {
            System.out.println("third symbol is: " + in.charAt(2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("This string is too short");
        }
    }

    /**
     * This method print symbol in given possition on given string
     *
     * @param in - given string
     * @param k  - given possition
     */
    public static void printKthSymbol(String in, int k) {
        try {
            System.out.println("At pos " + k + " symbol is " + in.charAt(k - 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("This string is too short");
        }
    }

    /**
     * This method print amount of same characters in given string
     *
     * @param in - given string
     */
    public static void printAmountOfSameCharacters(String in) {
        int cnt = 0;
        for (int i = 0; i < in.length() - 1; i++) {
            if (in.charAt(i) == in.charAt(i + 1)) {
                cnt++;
            }
        }
        System.out.println("Amount of same characters is " + cnt);
    }

    /**
     * This method prints given string with swapped second and forth character
     * If string length is less then four, then it print that string is too short/
     *
     * @param in - given string
     */
    public static void printWithSwappedCharacters(String in) {
        try {
            char f = in.charAt(1);
            char s = in.charAt(4);
            String toPrint = new String(in.substring(0, 1) + s + in.substring(2, 4) + f + in.substring(5, in.length()));
            System.out.print("String with swapped characters is " + toPrint);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("This string is too short");
        }
    }
}

