package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    int[] numbers = new int[10];
    static int player1Attempts = 0;
    static int player2Attempts = 0;
    int step;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber( int number) {
        if (player2Attempts != 0) {
            step++;
        }
        numbers[step] = number;
    }

    public int getNumber() {
        return  numbers[step];
    }

    public static void print(int[] numbers, int step) {
        int[] numbers1 = Arrays.copyOf(numbers, step + 1);
        System.out.println(Arrays.toString(numbers1));
    }
}
