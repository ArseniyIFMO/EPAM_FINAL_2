package com.epam.atmWithStrategy;

/**
 * This class is class for ATM account
 * All money saved on account
 */
public class Account {
    private static final Object key = new Object();
    private int amountOfMoney;

    /**
     * This method is for adding money to account
     *
     * @param deposit - amount of money to add to account
     */
    public void add(int deposit) {
        synchronized (key) {
            amountOfMoney += deposit;
        }
    }

    /**
     * This is constructor for account, it construct account with some starting amount of money
     *
     * @param startingAmountOfMoney - starting amount of money on account
     */
    public Account(int startingAmountOfMoney) {
        amountOfMoney = startingAmountOfMoney;
    }

    /**
     * This method take money from account
     * This method is thread-safe
     *
     * @param amountToTake - what amount of money you want to take from account
     */
    public void substract(int amountToTake) {
        synchronized (key) {
            amountOfMoney -= amountToTake;
        }
    }

    /**
     * This method return amount of money on your account, it's thread - safe
     *
     * @return amount of money on account
     */
    public int getCurrAmount() {
        synchronized (key) {
            return amountOfMoney;
        }
    }
}
