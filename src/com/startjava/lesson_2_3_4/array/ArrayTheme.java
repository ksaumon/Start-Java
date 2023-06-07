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
        int len = intArr.length;
        intArrOutput(intArr, len);
        System.out.println();
        for (int i = 0; i < len; i++) {
            int temp = intArr[i];
            intArr[i] = --len | intArr[len];
            intArr[len] = temp;
        }
        intArrOutput(intArr, len + len + 1);
        System.out.println();
    }

    public static void outputMultiplyArrValues() {
        System.out.println("\n2.Вывод произведения элементов массива");
        int result = 1;
        int[] multipliers = new int[10];
        int len = multipliers.length;
        for(int i = 0; i < len; i++) {
            multipliers[i] = i;
        }
        for(int i = 1; i < len - 1; i++) {
            result *= multipliers[i];
            String outputMultiply = i == (len - 2) ? "" : " * ";
                System.out.print(multipliers[i] + outputMultiply);
        }
        System.out.print(" = " + result + "\n");
        System.out.print(multipliers[0] + "в масcиве под индексом 0; " + multipliers[9] + "в масcиве под индексом 9\n");
    }

    public static void deleteArrValues() {
        System.out.println("\n3.Удаление элементов массива");
        double[] randomDoubles = new double[15];
        System.out.println("Исходный массив");
        int len = randomDoubles.length;
        for(int i = 0; i < len; i++) {
            randomDoubles[i] = Math.random();
        }
        double middleCellValue = randomDoubles[len / 2];
        randomDoublesOutput(randomDoubles, len);
        System.out.println("\nИзмененный массив");
        int zero = 0;
        for(int i = 0; i < len; i++) {
            if(randomDoubles[i] > middleCellValue) {
                randomDoubles[i] = 0;
                zero++;
            }
        }
        randomDoublesOutput(randomDoubles, len);
        System.out.println("\nКоличество обнуленных ячеек " + zero + "\n");
    }

    public static void reverseLadder() {
        System.out.println("4.Вывод элементов массива лесенкой в обратном порядке");
        char[] charSymbolArr = new char[26];
        for(char i = 'A'; i <= 'Z'; i++) {
            charSymbolArr[i - 'A'] = i;
        }
        int len = charSymbolArr.length;
        int countSymbol = 0;
        for(int i = len - 1; i >= countSymbol; i--) {
            for(int j = 0; j <= countSymbol; j++) {
                if(j <= countSymbol) {
                    System.out.print(charSymbolArr[(char) i]);
                    i--;
                }
            }
            System.out.println();
            countSymbol++;
            i = len;
        }
    }

    public static void numbersGeneration() {
        System.out.println("\n5.Генерация уникальных чисел");
        double[] doubleNumbersArr = new double[30];
        int len = doubleNumbersArr.length;
        int i,j;
        for(i = 0;i < len; i++) {
            doubleNumbersArr[i] = 60 + Math.round (Math.random() * 39);
            for(j = 0; j < i; j++) {
                if(doubleNumbersArr[i] == doubleNumbersArr[j]) {
                    i--;
                }
            }
        }
        int transfer = len / 3;
        for(i = 0; i < len; i++) {
            if (transfer == i) {
                transfer = transfer + transfer;
                System.out.println();
            }
            System.out.printf("%5.0f", doubleNumbersArr[i]);
        }
        System.out.println();
    }

    public static void copyLines() {
        System.out.println("\n6.Копирование не пустых строк");
        String[] stringArr = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int arrLength = 0;
        int len = stringArr.length;
        for(int i = 0; i < len; i++) {
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

    static void randomDoublesOutput(double[] randomDoubles, int len) {
        for(int i = 0; i < len; i++) {
            if(i % 8 == 0) {
                System.out.println();
            }
            System.out.printf("%8.3f", randomDoubles[i]);
        }
    }

    static void intArrOutput(int[] intArr, int len) {
        for(int i = 0; i < len; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}
