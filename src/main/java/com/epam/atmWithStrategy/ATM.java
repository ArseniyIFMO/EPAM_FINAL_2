package com.epam.atmWithStrategy;

/**
 * This is class for ATM
 */
public class ATM {

    private AtmStrategy ourStrategy;
    Account connectedTo;

    /**
     * This is constructor for atm, it construct atm  with some strategy
     * It's connected to some empty account with 0 amount of money by default
     *
     * @param strat - strategy for atm
     */
    public ATM(AtmStrategy strat) {
        ourStrategy = strat;
        connectedTo = new Account(0);
    }

    /**
     * Makes ATM connected to some account
     *
     * @param x - account
     */
    public void ConnectToAccount(Account x) {
        connectedTo = x;
    }

    /**
     * This methos puts money to account , wich is connected to this ATM now
     * It's using strategy of this account(toy or real)
     *
     * @param amount - amount of money to put
     */
    public void putMoney(int amount) {
        ourStrategy.putMoney(amount, connectedTo);
    }

    /**
     * This method tries to get money from account, which is connected to this ATM, using strategy for this ATM(toy or real)
     *
     * @param amount - amount of money to take
     */
    public void getMoney(int amount) {
        ourStrategy.getMoney(amount, connectedTo);
    }
}
