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
        int unknownNumber = rand.nextInt(2) + 1;
        defineWinner(unknownNumber);
    }

    public void defineWinner(int unknownNumber) {
        System.out.println("У каждого игрока по 10 попыток");
        while(true){
            while(Player.player1Attempts < 10 || Player.player2Attempts < 10) {
                System.out.print("Игрок " + player1.getName() + ", введите число: ");
                player1.setNumber(scanner.nextInt());
                Player.player1Attempts++;
                if(player1.getNumber() < startRange || player1.getNumber() > endRange) {
                    System.out.println(player1.getNumber() + "Число не входит в полуинтервал ( 0 - 100]");
                } else {
                    if(player1.getNumber() == unknownNumber) {
                        System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " + player1.getName()
                                + " вы победили!" + Player.player1Attempts + " попытки");
                        printWinner(player1, player2);
                        break;
                    }
                    String number = "число " + player1.getNumber();
                    System.out.println(player1.getNumber() > unknownNumber ? number + " больше того, что" +
                            "загадал компьютер." : number + " меньше того, что загадал компьютер.");
                }

                System.out.print("Игрок " + player2.getName() + ", введите число: ");
                player2.setNumber(scanner.nextInt());
                Player.player2Attempts++;
                if(player2.getNumber() < startRange || player2.getNumber() > endRange) {
                    System.out.println(player2.getNumber() + "Число не входит в полуинтервал ( 0 - 100]");
                } else {
                    if(player2.getNumber() == unknownNumber) {
                        System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " + player2.getName()
                                + " вы победили!" + Player.player2Attempts + " попытки");
                        printWinner(player1, player2);
                        break;
                    }
                    String number = "число " + player2.getNumber();
                    System.out.println(player2.getNumber() > unknownNumber  ? number + " больше того, что" +
                            "загадал компьютер." : number + " меньше того, что загадал компьютер.");
                }
            }

            if (Player.player1Attempts == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }
            if (Player.player2Attempts == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
            break;
        }
    }

    public static void printWinner( Player player1, Player player2) {
        player1.print(player1.numbers, player1.step);
        player2.print(player2.numbers, player2.step);
        Player.player1Attempts = 11;
        Player.player2Attempts = 11;
    }
}