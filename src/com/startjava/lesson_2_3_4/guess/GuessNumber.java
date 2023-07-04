package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util. Random;

public class GuessNumber {
    public static int startRange = 1;
    public static int endRange = 100;
    private Player player1;
    private Player player2;
    private Player player3;

    public GuessNumber(Player...player) {
        player1 = player[0];
        player2 = player[1];
        player3 = player[2];
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
            while (Player.player1Attempts < 10 || Player.player2Attempts < 10 || Player.player3Attempts < 10) {
                player1(player1, player2, player3, unknownNumber, scanner);
                if(player1.getNumber() == unknownNumber) {break;}
                player2(player1, player2, player3, unknownNumber, scanner);
                if(player2.getNumber() == unknownNumber) {break;}
                player3(player1, player2, player3, unknownNumber, scanner);
                if(player3.getNumber() == unknownNumber) {break;}
            }
            if(Player.player1Attempts == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }
            if(Player.player2Attempts == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                break;
            }
            break;
        }
    }

    public static void printWinner(Player player1, Player player2, Player player3) {
        player1.print(player1.numbers, player1.step);
        player2.print(player2.numbers, player2.step);
        player2.print(player3.numbers, player3.step);
        Player.player1Attempts = 11;
        Player.player2Attempts = 11;
        Player.player3Attempts = 11;
    }

    public static void player1(Player player1, Player player2, Player player3, int unknownNumber, Scanner scanner) {
        do {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.setNumber(scanner.nextInt());
        } while(player1.number1 < startRange || player1.number1 > endRange);
        Player.player1Attempts++;
        if(player1.getNumber() == unknownNumber) {
            System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " + player1.getName()
                    + " вы победили!" + Player.player1Attempts + " попытки");
            printWinner(player1, player2, player3);
        } else {
            String number = "число " + player1.getNumber();
            System.out.println(player1.getNumber() > unknownNumber ? number + " больше того, что" +
                    "загадал компьютер." : number + " меньше того, что загадал компьютер.");
        }
    }

    public static void player2(Player player1, Player player2,Player player3, int unknownNumber, Scanner scanner) {
        do {
            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.setNumber(scanner.nextInt());
        } while(player2.number1 < startRange || player2.number1 > endRange);
        Player.player2Attempts++;
        if(player2.getNumber() == unknownNumber) {
            System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " + player2.getName()
                    + " вы победили!" + Player.player2Attempts + " попытки");
            printWinner(player1, player2, player3);
        } else {
            String number1 = "число " + player2.getNumber();
            System.out.println(player2.getNumber() > unknownNumber ? number1 + " больше того, что" +
                    "загадал компьютер." : number1 + " меньше того, что загадал компьютер.");
        }
    }

    public static void player3(Player player1, Player player2,Player player3, int unknownNumber, Scanner scanner) {
        do {
            System.out.print("Игрок " + player3.getName() + ", введите число: ");
            player3.setNumber(scanner.nextInt());
        } while(player3.number1 < startRange || player3.number1 > endRange);
        Player.player3Attempts++;
        if(player3.getNumber() == unknownNumber) {
            System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " + player3.getName()
                    + " вы победили!" + Player.player3Attempts + " попытки");
            printWinner(player1, player2, player3);
        } else {
            String number2 = "число " + player3.getNumber();
            System.out.println(player2.getNumber() > unknownNumber ? number2 + " больше того, что" +
                    "загадал компьютер." : number2 + " меньше того, что загадал компьютер.");
        }
    }
}