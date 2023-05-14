package com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int unknownNumber = 20;
        int playerNumber = 100;
        int startRange = 1;
        int endRange = 100;
        if(playerNumber < startRange || playerNumber > endRange
                    || unknownNumber < startRange || unknownNumber > endRange) {
            System.out.println("Число не входит в полуинтервал ( 0 - 100]");
        } else {
            do {
                if(playerNumber > unknownNumber) {
                    System.out.println("число " + playerNumber + " больше того, что загадал компьютер.");
                    playerNumber--;
                }
                if(playerNumber < unknownNumber) {
                    System.out.println("число " + playerNumber + " меньше того, что загадал компьютер.");
                    playerNumber++;
                }
            } while(playerNumber != unknownNumber);
            System.out.println("число " + playerNumber + " загадал компьютер. \nВы победили!");
        }
    }
}