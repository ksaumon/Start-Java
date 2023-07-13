package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    int[] numbers = new int[10];
    private int attempt;
    private  String name;

    public Player(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setNumber(int number) {
        if(number < GuessNumber.startRange || number > GuessNumber.endRange) {
            System.out.println(number + " Число не входит в полуинтервал ( 0 - 100]");
        } else {
            numbers[attempt] = number;
            attempt++;
        }
    }

    public void print(int[] numbers, int step) {
        int[] numbers1 = Arrays.copyOf(numbers, step);
        System.out.println(Arrays.toString(numbers1));
    }
}
