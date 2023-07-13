package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(creationPlayer());
        Player player2 = new Player(creationPlayer());
        Player player3 = new Player(creationPlayer());
        GuessNumber guessNumber = new GuessNumber(player1,player2,player3);
        String option = "yes";
        do {
            if("yes".equals(option)) {
                guessNumber.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    public static String creationPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Игрок, введите имя: ");
        String name = scanner.nextLine();
        return name;
    }
}