package com.epam.seaFight;

public class MyField extends Field {
    /**
     * This method print my field with legend
     */
    public void print() {
        System.out.print("+ is ship, # is destroyed ship, O is hited watter, . is water\n  ");
        for (int i = 0; i < field.size(); i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.print(" Y");
        System.out.println();
        for (int i = 0; i < field.size(); i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < field.get(i).size(); j++) {
                field.get(i).get(j).printAsMine();
            }
            System.out.print("\n");
        }
    }

    /**
     * construct field with given size
     *
     * @param size - size of field
     */
    public MyField(int size) {
        super(size);
    }
}
