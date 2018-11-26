package com.epam.casino;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;

public class Race implements Callable<Integer> {
    ArrayList<Horse> horsesInRace;
    Random randomiser = new Random(100);

    public Integer call() {
        int idOfbest = 0;
        int random_component;
        int bestSpeedWithLuck = horsesInRace.get(0).getSpeed() + randomiser.nextInt();
        for (int i = 1; i < horsesInRace.size(); i++) {
            random_component = randomiser.nextInt();
            if (bestSpeedWithLuck < (horsesInRace.get(i).getSpeed() + random_component)) {
                bestSpeedWithLuck = (horsesInRace.get(i).getSpeed() + random_component);
                idOfbest = i;
            }
        }
        return idOfbest;
    }
}
