package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private static final int QUANTITY_PLAYERS = 3;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private Player[] players = new Player[QUANTITY_PLAYERS];

    public GuessNumber(Player player1, Player player2, Player player3) {
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        castLots();
    }

    private void castLots() {
        Random rand = new Random();
        for(int i = QUANTITY_PLAYERS - 1; i > 0; i--) {
            int randomIndex;
            Player temp;
            do {
                randomIndex = rand.nextInt(i + 1);
                temp = players[i];
            } while(players[i] == players[randomIndex]);
                players[i] = players[randomIndex];
                players[randomIndex] = temp;
        }

    }

    public void start() {
        defineWinner();
    }

    private void defineWinner() {
        Random rand = new Random();
        int unknownNumber = rand.nextInt(100) + 1;
        boolean winner = true;
        Player currentPlayer = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");
        while(true) {
            do {
                for(int i = 0; i < QUANTITY_PLAYERS; i++) {
                    currentPlayer = players[i];
                    winner = isGuessed(unknownNumber, scanner, currentPlayer);
                    if(winner) {
                        break;
                    }
                    if(currentPlayer.getAttempt() == Player.CAPACITY) {
                        System.out.println("У " + currentPlayer.getName() + " игрока закончились попытки");
                    }
                }
            } while(!winner && currentPlayer.getAttempt() != Player.CAPACITY);
            print();
            for(int i = 0; i < QUANTITY_PLAYERS; i++) {
                players[i].reset();
            }
            break;
        }
    }

    private boolean isGuessed(int unknownNumber, Scanner scanner, Player currentPlayer) {
        boolean move;
            do {
                System.out.print("Игрок " + currentPlayer.getName() + ", введите число: ");
                move = currentPlayer.addNumber(scanner.nextInt());
                if(!move) {
                    System.out.println("Данное число не входит в полуинтервал (0 - 100]");
                }
            } while(!move);
            if(currentPlayer.getNumber() == unknownNumber) {
                System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " +
                        currentPlayer.getName() + " вы победили!" +
                        currentPlayer.getAttempt() + " попытки");
                currentPlayer.upScore();
            } else {
                String choice = (currentPlayer.getNumber() > unknownNumber) ? " больше " : " меньше ";
                System.out.println(currentPlayer.getNumber() + choice + "того, что загадал компьютер.");
            }
        return (currentPlayer.getNumber() == unknownNumber);
    }

    private void print() {
        for(int i = 0; i < QUANTITY_PLAYERS; i++) {
            for(int number : players[i].getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void fineWinner() {
        int winnerIndex = 0;
        int maxScore = 0;
        for(int i = 0; i < QUANTITY_PLAYERS; i++) {
            if(players[i].getScore() > maxScore) {
                maxScore = players[i].getScore();
                players[winnerIndex] = players[i];
            }
        }
        int winnerCount = 0;
        for(int i = 0; i < QUANTITY_PLAYERS; i++) {
            if(players[i].getScore() == maxScore) {
                winnerCount++;
            }
        }
        if(winnerCount >= 2) {
            System.out.println("по результату 3 раундов ничья");
        } else {
            System.out.println("Игрок " + players[winnerIndex].getName() + " победил по результату 3 раундов");
        }
        for(int i = 0; i < QUANTITY_PLAYERS; i++) {
            players[i].resetScore();
        }
    }
}