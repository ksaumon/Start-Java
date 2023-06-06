package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseArrayValues();
        outputMultiplyArrValues();
        deleteArrValues();
        reverseLadder();
        numbersGeneration();
        copyLines();
    }

    public static void reverseArrayValues() {
        System.out.println("1.Реверс значений массива");
        int[] intArr = {2, 1, 3, 5, 4, 7, 6};
        intArrOutput(intArr);
        System.out.println();
        int len = intArr.length;
        for (int i = 0; i < len ; i++) {
            int temp = intArr[i];
            len--;
            intArr[i] = intArr[len];
            intArr[len] = temp;
        }
        intArrOutput(intArr);
        System.out.println();
    }

    public static void outputMultiplyArrValues() {
        System.out.println("\n2.Вывод произведения элементов массива");
        int result = 1;
        int[] multipliers = new int[10];
        for(int i = 0; i < multipliers.length; i++) {
            multipliers[i] = i;
        }
        for(int i = 1; i < multipliers.length - 1; i++) {
            result *= multipliers[i];
            boolean outputMultiply = i == (multipliers.length - 2) ? false : true;
            if(outputMultiply) {
                System.out.print(multipliers[i] + " * ");
            } else {
                System.out.print(multipliers[i]);
            }
        }
        System.out.print(" = " + result + "\n");
        System.out.print(multipliers[0] + " в масcиве под индексом 0; " + multipliers[9] + " в масcиве под индексом 9\n");
    }

    public static void deleteArrValues() {
        System.out.println("\n3.Удаление элементов массива");
        double[] randomDoubles = new double[15];
        int zero = 0;
        System.out.println("Исходный массив");
        for(int i = 0; i < randomDoubles.length; i++) {
            randomDoubles[i] = Math.random();
        }
        double middle = randomDoubles[randomDoubles.length / 2];
        randomDoublesOutput(randomDoubles);
        System.out.println("\nИзмененный массив");
        for(int i = 0; i < randomDoubles.length; i++) {
            if(middle < randomDoubles[i]) {
                randomDoubles[i] = 0;
                zero++;
            }
        }
        randomDoublesOutput(randomDoubles);
        System.out.println("\nКоличество обнуленных ячеек " + zero + "\n");
    }

    public static void reverseLadder() {
        System.out.println("4.Вывод элементов массива лесенкой в обратном порядке");
        int countSymbol = 0;
        char[] charArr = new char[26];
        for(char i = 65; i < 91; i++) {
            charArr[i - 65] = i;
        }
        for(int i = charArr.length - 1; i >= countSymbol; i--) {
            for(int j = 0; j <= countSymbol; j++) {
                if(j <= countSymbol) {
                    System.out.print(charArr[(char)i]);
                    i--;
                }
            }
            System.out.println();
            countSymbol++;
            i = charArr.length;
        }
    }

    public static void numbersGeneration() {
        System.out.println("\n5.Генерация уникальных чисел");
        double[] doubleArr = new double[30];
        int transfer = doubleArr.length / 3;
        int i,j;
        for(i = 0;i < doubleArr.length; i++) {
            doubleArr[i] = 60 + Math.round (Math.random() * 39);
            for(j = 0; j < i; j++) {
                if(doubleArr[i] == doubleArr[j]) {
                    i--;
                }
            }
        }
        for(i = 0; i < doubleArr.length; i++) {
            if (transfer == i) {
                transfer = transfer + transfer;
                System.out.println();
            }
            System.out.printf("%5.0f", doubleArr[i]);
        }
        System.out.println();
    }

    public static void copyLines() {
        System.out.println("\n6.Копирование не пустых строк");
        String[] stringArr = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int arrLength = 0;
        for(int i = 0; i < stringArr.length; i++) {
            if(!stringArr[i].equals("") && !stringArr[i].equals("    ")) {
                arrLength++;
            }
        }
        System.out.print(arrLength);
            System.out.println("\n" + Arrays.deepToString(stringArr));
        String[] stringArr1 = new String[arrLength];
        int filledCell = 0;
        for(int i = 0; i < arrLength; i++) {
            stringArr1[i] = stringArr[i];
            if(!stringArr[i].equals("") && !stringArr[i].equals("    ")) {
                filledCell++;
                System.arraycopy(stringArr, filledCell, stringArr1, 0, arrLength);
            }
        }
        //System.out.println("\n" + Arrays.deepToString(stringArr1));
        System.out.println();
    }

    static void randomDoublesOutput(double[] randomDoubles ) {
        for(int i = 0; i < randomDoubles.length; i++) {
            if(i % 8 == 0) {
                System.out.println();
            }
            System.out.printf("%8.3f", randomDoubles[i]);
        }
    }

    public static void intArrOutput(int[] intArr) {
        for(int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}
