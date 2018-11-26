package com.epam.seaFight;

import java.util.ArrayList;

/**
 * This is class for game field
 */
abstract class Field {
    int size;//this variable contains size of gaming field
    ArrayList<ArrayList<Cell>> field;

    /**
     * This method is checking for does any ship still alive, so have you lost already or not?
     *
     * @return
     */
    public boolean hasLost() {
        boolean lost = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((field.get(i).get(j).getHasShip() == true) && (field.get(i).get(j).getHasHit() == false)) {
                    lost = false;
                }
            }
        }
        return lost;
    }

    /**
     * This method construct field of given size
     *
     * @param size -size of field
     */
    public Field(int size) {
        this.size = size;
        field = new ArrayList<>(size);
        ArrayList<Cell> tmp;
        Cell tmpCell;
        for (int i = 0; i < size; i++) {
            tmp = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                tmpCell = new Cell();
                tmp.add(tmpCell);
            }
            field.add(tmp);
        }
    }

    /**
     * This method is for striking to some point of field
     *
     * @param x - x coordinate of strike
     * @param y - y coordinate of strike
     */
    public void putHit(int x, int y) {
        field.get(x).get(y).setHasHit(true);
    }

    /**
     * This method check, could you put ship to field or not?
     *
     * @param ship - ship to put
     * @return - could you put it to field?
     */
    private boolean couldPutShip(Ship ship) {
        if (ship.getIsHorizontalOriented() == true) {
            for (int i = 0; i < ship.getSize(); i++) {
                if (couldPutOnThisField(ship.getxPosOfBeg(), ship.getyPosOfBeg() + i) == false) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < ship.getSize(); i++) {
                if (couldPutOnThisField(ship.getxPosOfBeg() + i, ship.getyPosOfBeg()) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * This method check does section with coordinated x and y is valuable for putting ship there
     *
     * @param x - x coordinate of cell
     * @param y - y coordinate of cell
     * @return - could you put ship to this cell
     */
    private boolean couldPutOnThisField(int x, int y) {
        if (x >= size) {
            return false;
        }
        if (y >= size) {
            return false;
        }
        if (field.get(x).get(y).getHasShip() == true) {
            return false;
        }
        if (x != size - 1) {
            if (field.get(x + 1).get(y).getHasShip() == true) {
                return false;
            }
        }
        if (x != 0) {
            if (field.get(x - 1).get(y).getHasShip() == true) {
                return false;
            }
        }
        if (y != size - 1) {
            if (field.get(x).get(y + 1).getHasShip() == true) {
                return false;
            }
        }
        if (y != 0) {
            if (field.get(x).get(y - 1).getHasShip() == true) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method is for putting ships on your field, it's used by AI, because it doesnt print that you tried to put
     * s hip to bad possition, only throw ewxception
     *
     * @param x - ship to put
     * @throws IllegalArgumentException
     */
    public void putShipWithoutPrintingErrors(Ship x) throws IllegalArgumentException {
        if (x.getIsHorizontalOriented() == true) {
            for (int i = 0; i < x.getSize(); i++) {
                if (couldPutOnThisField(x.getxPosOfBeg(), x.getyPosOfBeg() + i) == false) {
                    throw new IllegalArgumentException();
                }
            }
            for (int i = 0; i < x.getSize(); i++) {
                field.get(x.getxPosOfBeg()).get(x.getyPosOfBeg() + i).setHasShip(true);
            }
        } else {
            for (int i = 0; i < x.getSize(); i++) {
                if (couldPutOnThisField(x.getxPosOfBeg() + i, x.getyPosOfBeg()) == false) {
                    throw new IllegalArgumentException();
                }
            }
            for (int i = 0; i < x.getSize(); i++) {
                field.get(x.getxPosOfBeg() + i).get(x.getyPosOfBeg()).setHasShip(true);
            }
        }
    }

    /**
     * This method tries to put ship on field
     * It's print that you couldn't put that ship on field to console
     *
     * @param x - ship to put
     * @throws IllegalArgumentException
     */
    public void putShip(Ship x) throws IllegalArgumentException {
        if (x.getIsHorizontalOriented() == true) {
            for (int i = 0; i < x.getSize(); i++) {
                if (couldPutOnThisField(x.getxPosOfBeg(), x.getyPosOfBeg() + i) == false) {
                    System.out.println("Failed to put ship on " + x.getxPosOfBeg() + " " + (x.getyPosOfBeg() + i));
                    throw new IllegalArgumentException();
                }
            }
            for (int i = 0; i < x.getSize(); i++) {
                field.get(x.getxPosOfBeg()).get(x.getyPosOfBeg() + i).setHasShip(true);
            }
        } else {
            for (int i = 0; i < x.getSize(); i++) {
                if (couldPutOnThisField(x.getxPosOfBeg() + i, x.getyPosOfBeg()) == false) {
                    System.out.println("Failed to put ship on " + (x.getxPosOfBeg() + i) + " " + (x.getyPosOfBeg()));
                    throw new IllegalArgumentException();
                }
            }
            for (int i = 0; i < x.getSize(); i++) {
                field.get(x.getxPosOfBeg() + i).get(x.getyPosOfBeg()).setHasShip(true);
            }
        }
    }

    abstract public void print();

    /**
     * This method return size of field
     *
     * @return
     */
    public int getSize() {
        return size;
    }
}
