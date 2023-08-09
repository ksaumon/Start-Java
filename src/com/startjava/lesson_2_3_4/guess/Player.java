package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CAPACITY = 10;
    private int[] numbers = new int[CAPACITY];
    private String name;
    private int attempt;
    private int score;

    public boolean addNumber(int number) {
        if(number < GuessNumber.START_RANGE || number > GuessNumber.END_RANGE) {
            return false;
        }
        numbers[attempt] = number;
        attempt++;
        return true;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void upScore() {
         score++;
    }

    public int getScore() {
        return score;
    }

    public void reset() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public void resetScore() {
        score = 0;
    }
}
