package com.startjava.lesson_2_3_4.guess;

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
        GuessNumber guessNumber = new GuessNumber(player1, player2, scanner);
        String option = "yes";
        do {
            if("yes".equals(option)) {
                Player.player1Attempts = 0;
                Player.player2Attempts = 0;
                guessNumber.start();
                scanner.nextLine();
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }
}