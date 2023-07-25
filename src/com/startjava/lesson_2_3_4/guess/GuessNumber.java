package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static final int QUANTITY_PLAYERS = 3;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private Player[] players = new Player[QUANTITY_PLAYERS];

    public GuessNumber(Player player1, Player player2, Player player3) {
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        castLots();
    }

    public void castLots() {
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
        Random rand = new Random();
        int unknownNumber = rand.nextInt(3) + 1;
        defineWinner(unknownNumber);
        fineWinner();
    }

    public void defineWinner(int unknownNumber) {
        boolean winner = false;
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
                    if(currentPlayer.getAttempts() == Player.CAPACITY) {
                        System.out.println("У " + currentPlayer.getName() + " игрока закончились попытки");
                        break;
                    }
                }
            } while(winner != true && currentPlayer.getAttempts() != Player.CAPACITY);
            if(currentPlayer.getAttempts() == Player.CAPACITY) {
                currentPlayer.reset();
            } else {
                for(int i = 0; i < QUANTITY_PLAYERS; i++) {
                    players[i].reset();
                }
            }
            break;
        }
    }

    public void fineWinner() {
        for (int i = 0; i < QUANTITY_PLAYERS; i++) {
            if (players[i].getScore() >= 2) {
                System.out.println("Игрок" + players[i].getName() + "победил по результату 3 раундов");
                System.exit(0);
            }
        }
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int element : players[i].getNumbers()) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public boolean isGuessed(int unknownNumber, Scanner scanner, Player currentPlayer) {
        boolean move;
            do {
                System.out.print("Игрок " + currentPlayer.getName() + ", введите число: ");
                move = currentPlayer.addNumber(scanner.nextInt());
                if(move == false) {
                    System.out.println("Данное число не входит в полуинтервал (0 - 100]");
                }
            } while(move == false);
            if(currentPlayer.getNumber() == unknownNumber) {
                System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " +
                        currentPlayer.getName() + " вы победили!" +
                        currentPlayer.getAttempts() + " попытки");
                currentPlayer.upScore();
            } else {
                String choice = (currentPlayer.getNumber() > unknownNumber) ? " больше " : " меньше ";
                System.out.println(currentPlayer.getNumber() + choice + "того, что загадал компьютер.");
            }
        return (currentPlayer.getNumber() == unknownNumber);
    }
}