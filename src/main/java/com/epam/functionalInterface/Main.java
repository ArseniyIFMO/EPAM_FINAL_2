/**
 * This is simple program where i implement functional inteface declarated in FuntionalInter
 */
package com.epam.functionalInterface;

public class Main {
    public static void main(String[] args) {
        FunctionalInter variable = (int x, int y, int z) -> {
            return x + y + z;
        };
        System.out.print(variable.addThree(1, 2, 3));
    }
}
