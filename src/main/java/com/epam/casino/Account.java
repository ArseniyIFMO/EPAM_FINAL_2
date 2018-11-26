package com.epam.casino;

/**
 * This is your account
 *
 */


public class Account {
    private int amountOfMoney;
    private static final Object key = new Object();

    /**
     * This function return amount of money on your account
     * @return amount of money
     */
    public int getAmountOfMoney() {
        return amountOfMoney;

    }

    /**
     * This function add money to your account
     * @param x - amount of money to add
     * @return - new balance
     */
    public int add(int x){
        amountOfMoney += x;
        return amountOfMoney;

    }

    /**
     * This function extract some eamount of money from your account
     * @param x - amount of money to extracy
     * @return nre amount of money
     */
    public int extract(int x){
        amountOfMoney -= x;
        return amountOfMoney;
    }

    /**
     * Construct account with some amount of money
     * @param startingMoney  - starting amount of money on your account
     */
    public Account(int startingMoney) {
        amountOfMoney = startingMoney;
    }

}
