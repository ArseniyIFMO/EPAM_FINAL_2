package com.epam.casino;

public class Account {
    int amountOfMoney;

    public Account(int startingMoney) {
        amountOfMoney = startingMoney;
    }

    public void betOnHorse(int horseNumber, int valueBet, Race raceToBet) {
        if (valueBet > amountOfMoney) {
            System.out.print("Not enough money");
        } else {
            /*
            Future <Integer> ourSurplus = new Future <Integer>();
            ExecutorService exe = Executors.newFixedThreadPool(10);
            ourSurplus = exe.submit( new Race() );
            try {
                amountOfMoney += ourSurplus.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            */
        }
    }
}
