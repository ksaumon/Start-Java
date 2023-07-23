package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CAPACITY = 10;
    private int[] numbers = new int[CAPACITY];
    private String name;
    private int attempt;

    public int getNumber() {
        return numbers[attempt - GuessNumber.START_RANGE];
    }

    public int[] getNumbers() {
        int[] numbers1 = Arrays.copyOf(numbers, attempt);
        return numbers1;
    }

    public int addNumber(int number) {
        if(number < GuessNumber.START_RANGE || number > GuessNumber.END_RANGE) {
            return number;
        }
        numbers[attempt] = number;
        attempt++;
        return number;
    }

    public void reset() {
        Arrays.fill(numbers, 0, attempt, 0);
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
