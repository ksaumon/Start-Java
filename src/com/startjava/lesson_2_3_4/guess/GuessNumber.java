package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static final int QUANTITY_PLAYERS = 3;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    Player[] players = new Player[QUANTITY_PLAYERS];
    public Player changePlayers;

    public GuessNumber(Player player1, Player player2, Player player3) {
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
    }

    public void start() {
        Random rand = new Random();
        int unknownNumber = rand.nextInt(2) + 100;
        defineWinner(unknownNumber);
    }

    public void defineWinner(int unknownNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");
        while(true) {
            do {
                for(int i = 0; i < 3; i++) {
                    changePlayers = players[i];
                    player(unknownNumber, scanner);
                    if(players[i].getNumber() == unknownNumber) {
                        print();
                        break;
                    }
                    if(changePlayers.countAttempts() == 10) {
                        System.out.println("У " + changePlayers.getName() + " игрока закончились попытки");
                        break;
                    }
                }
            } while(changePlayers.getNumber() != unknownNumber && changePlayers.countAttempts() != 10);
            reset();
            break;
        }
    }

    public void player(int unknownNumber, Scanner scanner) {
        while(true) {
            do {
                System.out.print("Игрок " + changePlayers.getName() + ", введите число: ");
                changePlayers.addNumber(scanner.nextInt());
                if(changePlayers.getNumber() < START_RANGE || changePlayers.getNumber() > END_RANGE) {
                    System.out.println(changePlayers.getNumber() + " Число не входит в полуинтервал ( 0 - 100]");
                }
            } while(changePlayers.getNumber()
                    < START_RANGE || changePlayers.getNumber() > END_RANGE);
            if(changePlayers.getNumber() == unknownNumber) {
                System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " +
                        changePlayers.getName() + " вы победили!" +
                        changePlayers.countAttempts() + " попытки");
                break;
            } else {
                System.out.println(changePlayers.getNumber()
                        > unknownNumber ? changePlayers.getNumber()
                        + " больше того, что " + "загадал компьютер."
                        : changePlayers.getNumber()
                        + " меньше того, что загадал компьютер.");
                break;
            }
        }
    }

    public void reset() {
        for(int i = 0; i <= 2; i++) {
            Arrays.fill(players[i].getNumbers(), 0);
        }
    }

    public void print() {
        for(int i = 0; i <= 2; i ++) {
            int[] numbers1 = Arrays.copyOf(players[i].getNumbers(), players[i].countAttempts());
            System.out.println(Arrays.toString(numbers1));
        }
    }
}