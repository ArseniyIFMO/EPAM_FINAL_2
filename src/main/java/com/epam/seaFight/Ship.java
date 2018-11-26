package com.epam.seaFight;

/**
 * This class describe ship
 */
public class Ship {
    private int xPosOfBeg;
    private int yPosOfBeg;
    private int size;
    private boolean isHorizontalOriented;

    /**
     * This method return x position where does this ship starts
     *
     * @return
     */
    public int getxPosOfBeg() {
        return xPosOfBeg;
    }

    /**
     * This method return y position where does this ship starts
     *
     * @return
     */
    public int getyPosOfBeg() {
        return yPosOfBeg;
    }

    /**
     * This method return size of ship
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * This methos tells is this ship horizontal oriented or not?
     *
     * @return
     */
    public boolean getIsHorizontalOriented() {
        return isHorizontalOriented;
    }

    /**
     * This is constructor of ship
     *
     * @param xPos         - x position of beggining
     * @param yPos         - y position of beggining
     * @param length       - length of ship
     * @param isHorizontal - is this ship horizontal oriented?
     */
    public Ship(int xPos, int yPos, int length, boolean isHorizontal) {
        xPosOfBeg = xPos;
        yPosOfBeg = yPos;
        size = length;
        isHorizontalOriented = isHorizontal;
    }
}
