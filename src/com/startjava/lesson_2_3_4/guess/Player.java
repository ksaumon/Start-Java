package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private int[] number;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = new int[]{number};
     }

    public int[] getNumber() {
        int o = 0;
        if (number[0] == 0) {
            o = number[0 + 1];
        }
        return Arrays.copyOf(number,number.length - o);
    }
}