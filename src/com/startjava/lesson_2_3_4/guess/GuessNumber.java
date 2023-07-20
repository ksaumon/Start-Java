package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static final int QUANTITY_PLAYERS = 3;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private Player[] players = new Player[QUANTITY_PLAYERS];
    private boolean winner;

    public GuessNumber(Player player1, Player player2, Player player3) {
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
    }

    public void start() {
        Random rand = new Random();
        int unknownNumber = rand.nextInt(END_RANGE) + START_RANGE;
        defineWinner(unknownNumber);
    }

    public void defineWinner(int unknownNumber) {
        Player currentPlayer = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");
        while(true) {
            do {
                for(int i = 0; i < QUANTITY_PLAYERS; i++) {
                    currentPlayer = players[i];
                    winner = isGuessed(unknownNumber, scanner, currentPlayer);
                    if(winner == true) {
                        print();
                        break;
                    }
                    if(currentPlayer.countAttempts() == Player.CAPACITY) {
                        System.out.println("У " + currentPlayer.getName() + " игрока закончились попытки");
                        break;
                    }
                }
            } while(winner != true && currentPlayer.countAttempts() != Player.CAPACITY);
            if(currentPlayer.countAttempts() == Player.CAPACITY) {
                currentPlayer.reset();
            } else {
                for(int i = 0; i < QUANTITY_PLAYERS; i++) {
                    players[i].reset();
                }
            }
            break;
        }
    }

    public boolean isGuessed(int unknownNumber, Scanner scanner, Player currentPlayer) {
        int move;
        while(true) {
            do {
                System.out.print("Игрок " + currentPlayer.getName() + ", введите число: ");
                move = currentPlayer.addNumber(scanner.nextInt());
                if(move < START_RANGE || move > END_RANGE) {
                    System.out.println(move + " Число не входит в полуинтервал ( 0 - 100]");
                }
            } while(move < START_RANGE || move > END_RANGE);
            if(currentPlayer.getNumber() == unknownNumber) {
                System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " +
                        currentPlayer.getName() + " вы победили!" +
                        currentPlayer.countAttempts() + " попытки");
                break;
            }
            String choice = (currentPlayer.getNumber() > unknownNumber) ? " больше " :  " меньше ";
            System.out.println(currentPlayer.getNumber() + choice + "того, что загадал компьютер.");
            break;
        }
        return (currentPlayer.getNumber() == unknownNumber);
    }

    public void print() {
        for(int i = 0; i < QUANTITY_PLAYERS; i++) {
            int[] numbers1 = Arrays.copyOf(players[i].getNumbers(), players[i].countAttempts());
            for(int j = 0; j < numbers1.length; j++) {
                System.out.printf(numbers1[j] + " ");
            }
            System.out.println();
        }
    }
}