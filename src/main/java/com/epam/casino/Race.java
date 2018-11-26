package com.epam.casino;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * This class describe race
 *
 */

public class Race implements Callable<Integer> {
    ArrayList<Horse> horsesInRace;
    int myHorse;
    int myBet;
    Random randomiser = new Random(100);

    /**
     * Create race with horses, you bet some amount of money on some horse
     * @param newHorses - list of horses on race
     * @param horseNumber - number of horse you bet
     * @param betAmount - amount of money you bet
     */
    public Race(ArrayList<Horse> newHorses, int horseNumber, int betAmount){
            horsesInRace = newHorses;
            myHorse = horseNumber;
            myBet = betAmount;
    }

    /**
     * This method return amount of money you won on race
     * To simulate waiting time before race ends it sleep for some amount of time
     * it return result as fast as race ends
     * @return amount of money you won
     */
    public Integer call() {
        int idOfbest = 0;
        int random_component;
        try {
            TimeUnit.SECONDS.sleep(randomiser.nextInt(15));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int bestSpeedWithLuck = horsesInRace.get(0).getSpeed() + randomiser.nextInt();
        for (int i = 1; i < horsesInRace.size(); i++) {
            random_component = randomiser.nextInt();
            if (bestSpeedWithLuck < (horsesInRace.get(i).getSpeed() + random_component)) {
                bestSpeedWithLuck = (horsesInRace.get(i).getSpeed() + random_component);
                idOfbest = i;
            }
        }
        if(idOfbest == myHorse) {
            return myBet * 2;
        }
        else {
            return 0;
        }
    }
}
