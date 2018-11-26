package com.epam.atmWithStrategy;

public class ThreadToTestToyAtm extends Thread {
    private ATM atm1 = new ATM(new ToyAtmStrategy());

    public void run() {
        atm1.putMoney(100);
        atm1.putMoney(100);
        atm1.getMoney(30);
        atm1.getMoney(1000);
    }
}
