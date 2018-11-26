package com.epam.atmWithStrategy;

public class ToyAtmStrategy implements AtmStrategy {
    /**
     * This method puts some amount of money to account
     *
     * @param value - amount to take
     * @param acc   - account
     */
    public void putMoney(int value, Account acc) {
        acc.add(value);
        System.out.print("You have put" + value + " Now you have " + acc.getCurrAmount() + "\n");
    }

    /**
     * This method only says error, because you cant take money from toy atm
     *
     * @param value - amount of money to take from account
     * @param acc   - account
     */
    public void getMoney(int value, Account acc) {
        System.out.print("Sorry, it's toy atm, tou can't take money\n");
    }
}
