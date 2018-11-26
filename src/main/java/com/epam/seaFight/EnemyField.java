package com.epam.seaFight;

import java.util.Random;

public class EnemyField extends Field {
    /**
     * This method randomly put ships on your opponents field
     * (according to rules, so it cant put ships on near other, or away from map or something, everyrhing is checked
     *
     * @param size - size of field you want to generate
     */
    public EnemyField(int size) {
        super(size);
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            try {
                this.putShipWithoutPrintingErrors(new Ship(rand.nextInt(size), rand.nextInt(size), 1, rand.nextBoolean()));
            } catch (Exception e) {
                i--;
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                this.putShipWithoutPrintingErrors(new Ship(rand.nextInt(size), rand.nextInt(size), 2, rand.nextBoolean()));
            } catch (Exception e) {
                i--;
            }
        }
        for (int i = 0; i < 2; i++) {
            try {
                this.putShipWithoutPrintingErrors(new Ship(rand.nextInt(size), rand.nextInt(size), 3, rand.nextBoolean()));
            } catch (Exception e) {
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            try {
                this.putShipWithoutPrintingErrors(new Ship(rand.nextInt(size), rand.nextInt(size), 3, rand.nextBoolean()));
            } catch (Exception e) {
                i--;
            }
        }
    }

    /**
     * This method is for printing enemy field
     * It prints only was cell shot or not, have you hit , or not
     * According to legend
     */
    public void print() {
        System.out.print("+ is ship, # is destroyed ship, O is hited watter, . is water\n  ");
        for (int i = 0; i < field.size(); i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.print(" Y");
        System.out.println();
        for (int i = 0; i < field.size(); i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < field.get(i).size(); j++) {
                field.get(i).get(j).printAsEnemy();
            }
            System.out.print("\n");
        }
    }
}
