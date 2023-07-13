package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util. Random;

public class GuessNumber {
    Player[] players = new Player[3];
    public Player changePlayers;
    public static final int startRange = 1;
    public static final int endRange = 100;
    public GuessNumber(Player player1, Player player2, Player player3) {
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
    }

    public void start() {
        Random rand = new Random();
        int unknownNumber = rand.nextInt(2) + 1;
        defineWinner(unknownNumber);
    }

    public void defineWinner(int unknownNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");
        while(true) {
            while(players[0].getAttempt() < 10 || players[1].getAttempt() < 10 || players[2].getAttempt() < 10) {
                changePlayers = players[0];
                player(unknownNumber, scanner);
                if(players[0].numbers[players[0].getAttempt() - 1] == unknownNumber) {
                    printWinner(players[0], players[1], players[2]);
                    reset();
                    break;
                }
                changePlayers = players[1];
                player(unknownNumber, scanner);
                if(players[1].numbers[players[1].getAttempt() - 1] == unknownNumber) {
                    printWinner(players[0], players[1], players[2]);
                    reset();
                    break;
                }
                changePlayers = players[2];
                player(unknownNumber, scanner);
                if(players[2].numbers[players[2].getAttempt() - 1] == unknownNumber) {
                    printWinner(players[0], players[1], players[2]);
                    reset();
                    break;
                }
            }
            if(changePlayers.getAttempt() == 10) {
                System.out.println("У " + changePlayers.getName() + " игрока закончились попытки");
                break;
            }
            break;
        }
    }

    public void printWinner(Player player1, Player player2, Player player3) {
        player1.print(player1.numbers, player1.getAttempt());
        player2.print(player2.numbers, player2.getAttempt());
        player2.print(player3.numbers, player3.getAttempt());
        player1.setAttempt(10);
        player2.setAttempt(10);
        player3.setAttempt(10);
    }

    public void player(int unknownNumber, Scanner scanner) {
        while (true) {
            do {
                System.out.print("Игрок " + changePlayers.getName() + ", введите число: ");
                changePlayers.setNumber(scanner.nextInt());
            } while(changePlayers.numbers[changePlayers.getAttempt() - 1]
                    < startRange || changePlayers.numbers[changePlayers.getAttempt() - 1] > endRange);
            if(changePlayers.numbers[changePlayers.getAttempt() - 1] == unknownNumber) {
                System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " +
                        changePlayers.getName() + " вы победили!" +
                        changePlayers.getAttempt() + " попытки");
                break;
            } else {
                System.out.println(changePlayers.numbers[changePlayers.getAttempt() - 1]
                        > unknownNumber ? changePlayers.numbers[changePlayers.getAttempt() - 1]
                        + " больше того, что " + "загадал компьютер."
                        : changePlayers.numbers[changePlayers.getAttempt() - 1]
                        + " меньше того, что загадал компьютер.");
                break;
            }
        }
    }

    public void reset() {
        Arrays.fill(players[0].numbers, 0, players[0].getAttempt(), 0);
        Arrays.fill(players[1].numbers, 0, players[1].getAttempt(), 0);
        Arrays.fill(players[2].numbers, 0, players[2].getAttempt(), 0);
        players[0].setAttempt(0);
        players[1].setAttempt(0);
        players[2].setAttempt(0);
    }
}