package com.epam.casino;

/**
 * This class describe horse
 */
public class Horse {
    private int speed;

    /**
     * This method for getting speed of horse
     * @return speed of horse
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * This method construct new horse with some speed
     * @param speed - speed of this horse
     */
    public Horse(int speed) {
        this.speed = speed;
    }
}
