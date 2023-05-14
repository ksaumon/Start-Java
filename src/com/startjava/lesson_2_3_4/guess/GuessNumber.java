package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util. Random;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void start() {
        Random rand = new Random();
        int unknownNumber = rand.nextInt(100) + 1;
        defineWinner(unknownNumber);
    }

    public void defineWinner(int unknownNumber) {
        do {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.setNumber(scanner.nextInt());
            if(player1.getNumber() < startRange || player1.getNumber() > endRange) {
                System.out.println(player1.getNumber() + "Число не входит в полуинтервал ( 0 - 100]");
            } else {
                if(player1.getNumber() == unknownNumber) {
                    System.out.println("число " + unknownNumber +
                            " загадал компьютер. Игрок " + player1.getName() + " вы победили!");
                    break;
                }
                if(player1.getNumber() > unknownNumber) {
                    System.out.println("число " + player1.getNumber() + " больше того, что загадал компьютер.");
                } else {
                    System.out.println("число " + player1.getNumber() + " меньше того, что загадал компьютер.");
                }
            }

            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.setNumber(scanner.nextInt());
            if(player2.getNumber() < startRange || player2.getNumber() > endRange) {
                System.out.println(player2.getNumber() + "Число не входит в полуинтервал ( 0 - 100]");
            } else {
                if(player2.getNumber() == unknownNumber) {
                    System.out.println("число " + unknownNumber +
                            " загадал компьютер. Игрок " + player2.getName() + " вы победили!");
                    break;
                }
                if(player2.getNumber() < unknownNumber) {
                    System.out.println("число " + player2.getNumber() + " меньше того, что загадал компьютер.");
                } else {
                    System.out.println("число " + player2.getNumber() + " больше того, что загадал компьютер.");
                }
            }
        } while(true);
    }
}