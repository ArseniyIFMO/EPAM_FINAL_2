package com.epam.casino;

import com.epam.functionalInterface.FunctionalInter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * This is program for simulating bookmaker
 * At the beggining you should print your starting amount of money
 * Then you could chose if you want to bet on some race or not
 * Race doesn't start immediatly, they start in some time, when race ends, you get your win, or get nothing,
 * and when race ends you get message
 * you could make next bet until previous is finished
 * as races starts not immediatly, i wrapped them into future
 */

public class Casino {
    public static void main(String[] args) {
        final int horsesInRace = 4;
        Random randomiser = new Random(500);
        System.out.println("Hi, this is bookmaker");
        System.out.println("Print your starting amount of money");
        Scanner scanner = new Scanner(System.in);
        int x;
        int toBetOn;
        int bet;
        int surplus;
        Future<Integer> fut;
        ArrayList<Horse> horsesToRace = new ArrayList<>();
        LinkedList<Future<Integer>> currentRaces = new LinkedList<>();
        x = scanner.nextInt();
        Account yourAcc = new Account(x);
        System.out.println("Hi, i would tell you what races are avaliable now, if you want to bet play ");
        while ((yourAcc.getAmountOfMoney() != 0) || (!currentRaces.isEmpty())) {
            horsesToRace = new ArrayList<>();
            for (int i = 0; i < horsesInRace; i++) {
                horsesToRace.add(new Horse(randomiser.nextInt(100)));
            }
            System.out.println("Hi, in next race you have horses with speed:");
            System.out.println("Which one yout want to bet?");
            System.out.println("Money on your account would be added as far as race would end, if you dont want");
            System.out.print(" to parcticipate in race print -1");
            System.out.println("In this race you have horses with speed");
            for (int i = 0; i < horsesInRace; i++) {
                System.out.println(horsesToRace.get(i).getSpeed() + " ");
            }
            System.out.println("What horse you want to bet?\n");
            toBetOn = scanner.nextInt();
            if (toBetOn == -1) {
                System.out.println("Ok, next race\n");
            } else {
                if ((toBetOn >= 1) && (toBetOn <= horsesInRace)) {
                    System.out.println("Print how much money you want to bet");
                    bet = scanner.nextInt();
                    ExecutorService exe = Executors.newFixedThreadPool(10);
                    fut = exe.submit(new Race(horsesToRace, toBetOn - 1, bet));
                    currentRaces.add(fut);
                } else {
                    System.out.println("Sorry, no such horse\n");
                }
            }
            for (int i = 0; i < currentRaces.size(); i++) {
                if (currentRaces.get(i).isDone()) {
                    try {
                        surplus = currentRaces.get(i).get().intValue();
                        if (surplus > 0) {
                            System.out.println("Congrats, you won" + surplus + "\n");
                        } else {
                            System.out.println("Ops, bad luck\n");
                        }
                        yourAcc.add(surplus);
                    } catch (Exception e) {
                        System.out.println("Something bad\n");
                    }
                }
            }
        }
    }
}
