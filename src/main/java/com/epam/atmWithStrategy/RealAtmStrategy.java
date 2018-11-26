package com.epam.atmWithStrategy;

/**
 * This is implementation of strategy for real ATM
 */
public class RealAtmStrategy implements AtmStrategy {
    /**
     * This method  put some amount of money to account
     *
     * @param value - amount to take
     * @param acc   - account
     */
    public void putMoney(int value, Account acc) {
        acc.add(value);
        System.out.print("You've put " + value + " Now you have " + acc.getCurrAmount() + "\n");
    }

    /**
     * This mmethod tries to put money on account
     * it says amount of money you still have, and says if it's not enough money
     *
     * @param value - amount of money to take from account
     * @param acc   - acount
     */
    public void getMoney(int value, Account acc) {
        if (acc.getCurrAmount() >= value) {
            acc.substract(value);
            System.out.print("You've taken " + value + " Now you have " + acc.getCurrAmount() + "\n");
        } else {
            System.out.print("Sorry, not enough money\n");
        }
    }
}
