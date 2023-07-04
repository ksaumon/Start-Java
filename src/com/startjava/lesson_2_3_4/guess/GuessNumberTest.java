package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Игрок 1, введите имя: ");
        String name = scanner.nextLine();
        Player player1 = new Player(name);
        System.out.print("Игрок 2, введите имя: ");
        name = scanner.nextLine();
        Player player2 = new Player(name);
        System.out.print("Игрок 3, введите имя: ");
        name = scanner.nextLine();
        Player player3 = new Player(name);
        GuessNumber guessNumber = new GuessNumber(player1, player2, player3);
        String option = "yes";
        do {
            if("yes".equals(option)) {
                guessNumber.start();
                reset(player1, player2, player3);
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    public static void reset(Player player1, Player player2, Player player3) {
        Arrays.fill(player1.numbers, 0, player1.step, 0);
        Arrays.fill(player2.numbers, 0, player2.step, 0);
        Arrays.fill(player3.numbers, 0, player3.step, 0);
        Player.player1Attempts = 0;
        Player.player2Attempts = 0;
        Player.player3Attempts = 0;
        player1.step = 0;
        player2.step = 0;
        player3.step = 0;
    }

    public static void drawLots() {
        int[] numberLots = {1, 2, 3, 4, 5, 6, 7, 8};
        int randomNumbers;
        for (int i = 0; i < numberLots.length; i++) {
            randomNumbers = (int) (1 + (Math.random() * 8));
            numberLots[i] = randomNumbers;
        }
    }
}