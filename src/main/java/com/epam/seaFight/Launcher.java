package com.epam.seaFight;

import java.util.Random;


import java.util.Scanner;

/**
 * This is launcher for Sea Fight game, made by me
 * At the beggining of game you should say where you want to locate your ships and start to fight
 * First who kills all oponents ships win
 * This game is only for one player
 * AI is very bad
 **/
public class Launcher {
    public static void main(String[] args) {
        int size = 9;
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        int x, y, z;
        MyField myField = new MyField(size);
        EnemyField enemyField = new EnemyField(size);
        System.out.print("At first you should locate your ships\n");
        System.out.print("At first locate your one sized ship\n");
        System.out.print("You have " + size + "x" + size + " field\n");
        System.out.print("Write four times two numbers where to locate them, they should lie in [1, " + size + "] range");
        for (int i = 0; i < 4; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            try {
                myField.putShip(new Ship(x - 1, y - 1, 1, true));
            } catch (IllegalArgumentException e) {
                System.out.print("you cant place ship here, this, or some near points have ships");
                i--;
            }
        }
        myField.print();
        System.out.println("Ok, here is your ships, now you have to locate three ships of two sels");
        System.out.println("Write their positions in format x y 1 for horizontal oriented ships, x y 0 for vertical");
        for (int i = 0; i < 3; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            try {
                if (z == 1) {
                    myField.putShip(new Ship(x - 1, y - 1, 2, true));
                }
                else {
                    myField.putShip(new Ship(x - 1, y - 1, 2, false));
                }
            } catch (IllegalArgumentException e) {
                System.out.print("you cant place ship here, this, or some near points have ships");
                i--;
            }
        }
        System.out.println("Ok, here is your field now\n");
        myField.print();
        System.out.println("Ok, here is your ships, now you have to locate two ships of three cels");
        for (int i = 0; i < 2; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            try {
                if (z == 1) {
                    myField.putShip(new Ship(x - 1, y - 1, 3, true));
                }
                else {
                    myField.putShip(new Ship(x - 1, y - 1, 3, false));
                }
            } catch (IllegalArgumentException e) {
                System.out.print("you cant place ship here, this, or some near points have ships");
                i--;
            }
        }
        System.out.println("Ok, here is your field now\n");
        myField.print();
        System.out.print("Now you have to put one ship with length 4\n");
        for (int i = 0; i < 1; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            try {
                if (z == 1) {
                    myField.putShip(new Ship(x - 1, y - 1, 4, true));
                }
                else {
                    myField.putShip(new Ship(x - 1, y - 1, 4, false));
                }
            } catch (IllegalArgumentException e) {
                System.out.print("you cant place ship here, this, or some near points have ships");
                i--;
            }
        }
        System.out.println("Ok, here is your field now\n");
        myField.print();
        System.out.println("So, let's game started, try to kill your opponent before he kills you");
        while ((!myField.hasLost()) && (!enemyField.hasLost())) {
            System.out.println("YOUR FIELD\n");
            myField.print();
            System.out.println("YOUR OPPONENT'S FIELD\n");
            enemyField.print();
            System.out.println("Where to shot?\n");
            x = scan.nextInt();
            y = scan.nextInt();
            enemyField.putHit(x - 1, y - 1);
            myField.putHit(ran.nextInt(size), ran.nextInt(size));
        }
    }
}
