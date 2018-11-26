package com.epam.traficLight;

import java.util.*;

/**
 * This is a first task
 **/
public class TrafficLight {
    /**
     * This is a simple method, that reads integer from input, and print color of traffic light in that moment
     */
    public static void main(String[] x) {
        Scanner in = new Scanner(System.in);
        int n;
        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Wrong input format");
            return;
        }
        n = n % 10;
        if (n <= 2) {
            System.out.print("Red");
        } else {
            if (n <= 5) {
                System.out.print("Yellow");
            } else {
                System.out.print("Green");
            }
        }
    }
}