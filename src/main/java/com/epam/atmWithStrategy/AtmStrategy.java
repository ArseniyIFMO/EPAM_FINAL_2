package com.epam.atmWithStrategy;

/**
 * This interface provides methods that should be implemented in strategy for ATM
 */
public interface AtmStrategy {
    /**
     * This method takes some amount of money from account
     *
     * @param value - amount to take
     * @param acc   - account
     */
    void putMoney(int value, Account acc);

    /**
     * This method for getting money from account
     *
     * @param value - amount of money to take from account
     * @param acc   - account
     */
    void getMoney(int value, Account acc);
}
