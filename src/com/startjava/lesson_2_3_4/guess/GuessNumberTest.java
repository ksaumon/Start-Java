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
        String option = "yes";
        do {
            if("yes".equals(option)) {
                GuessNumber guessNumber = new GuessNumber(player1, player2, scanner);
                guessNumber.start();
                scanner.nextLine();
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = scanner.nextLine();
            }
        } while(!"no".equals(option));
    }
}