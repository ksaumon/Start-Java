package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CAPACITY = 10;
    private int[] numbers = new int[CAPACITY];
    private String name;
    private int score;
    private int attempt;

    public boolean addNumber(int number) {
        boolean number1 = false;
        if(number < GuessNumber.START_RANGE || number > GuessNumber.END_RANGE) {
            return number1;
        }
        numbers[attempt] = number;
        attempt++;
        number1 = true;
        return number1;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int[] getNumbers() {
        int[] numbers1 = Arrays.copyOf(numbers, attempt);
        return numbers1;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void upScore() {
         score++;
    }

    public int getScore() {
        return score;
    }

    public int getAttempts() {
        return attempt;
    }

    public void reset() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
