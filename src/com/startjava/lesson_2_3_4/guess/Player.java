package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private int number;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        int[] number1 = new int[20];
        for (int i = 0; i < number; i++) {
            number1[i] = i;
            number1[i] = number;
            i = number;
        }
            this.number = number;
     }

    public int getNumber() {

        return number;
    }

    public void print(int[] number1) {
        for (int i = 0; i < number1.length; i++) {
            number1[i] = i;
            System.out.println(number1[i]);
        }
    }
}