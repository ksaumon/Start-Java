package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CAPACITY = 10;
    private int[] numbers = new int[CAPACITY];
    private String name;
    private int attempt;

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int addNumber(int number) {
        if(number < GuessNumber.START_RANGE || number > GuessNumber.END_RANGE) {
            return number;
        } else {
        numbers[attempt] = number;
        attempt++;
        }
        return number;
    }

    public void reset() {
        Arrays.fill(getNumbers(), 0);
        attempt = 0;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int countAttempts() {
        return attempt;
    }
}
