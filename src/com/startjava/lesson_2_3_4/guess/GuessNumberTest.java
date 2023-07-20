package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(createPlayer(scanner));
        Player player2 = new Player(createPlayer(scanner));
        Player player3 = new Player(createPlayer(scanner));
        GuessNumber game = new GuessNumber(player1, player2, player3);
        String option = "yes";
        do {
            if("yes".equals(option)) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    public static String createPlayer(Scanner scanner) {
        System.out.print("Игрок, введите имя: ");
        return scanner.nextLine();
    }
}