package com.startjava.lesson_2_3_4.guess;

public class Player {
    public static final int PLAYER_NUMBER = 11;
    private int[] numbers = new int[PLAYER_NUMBER];
    private String name;
    private int attempt;

    public Player( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumber(int number) {
        while(number < GuessNumber.START_RANGE || number > GuessNumber.END_RANGE) {
            break;
        }
        numbers[attempt] = number;
        if(attempt == 10) {
            attempt = 0;
            numbers[attempt] = number;
            attempt++;
        } else {
            attempt++;
        }
    }

    public int countAttempts() {
        return attempt;
    }
}
