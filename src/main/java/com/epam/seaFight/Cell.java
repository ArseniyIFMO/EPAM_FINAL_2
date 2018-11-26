package com.epam.seaFight;

public class Cell {
    /**
     * This method check does ship on this cell
     *
     * @return does this cell contain ship
     */
    public boolean getHasShip() {
        return hasShip;
    }

    /**
     * This method put ship on this point
     *
     * @param hasShip
     */
    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    /**
     * This method says does this cell was shot
     *
     * @return
     */
    public boolean getHasHit() {
        return hasHit;
    }

    /**
     * This method shoot to this cell
     *
     * @param hasHit
     */
    public void setHasHit(boolean hasHit) {
        this.hasHit = hasHit;
    }

    private boolean hasShip;
    private boolean hasHit;

    public Cell() {
        hasShip = false;
        hasHit = false;
    }

    /**
     * This method for printing this cell as it mine
     */
    public void printAsMine() {
        if ((hasShip) && (hasHit)) {
            System.out.print(" #");
        }
        if ((hasShip) && (!hasHit)) {
            System.out.print(" +");
        }
        if ((!hasShip) && (hasHit)) {
            System.out.print(" o");
        }
        if ((!hasHit) && (!hasShip)) {
            System.out.print(" .");
        }
    }

    /**
     * This method is for printing cell as it's opponents
     */
    public void printAsEnemy() {
        if ((hasShip) && (hasHit)) {
            System.out.print(" #");
        }
        if ((hasShip) && (!hasHit)) {
            System.out.print(" .");
        }
        if ((!hasShip) && (hasHit)) {
            System.out.print(" o");
        }
        if ((!hasHit) && (!hasShip)) {
            System.out.print(" .");
        }
    }
}
