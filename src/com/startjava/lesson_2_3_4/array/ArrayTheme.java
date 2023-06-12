package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArrValues();
        outputMultiplyArrValues();
        deleteArrValues();
        reverseLadder();
        generateNumbers();
        copyLines();
    }

    public static void reverseArrValues() {
        System.out.println("1.Реверс значений массива");
        int[] intArr = {2, 1, 3, 5, 4, 7, 6};
        int len = intArr.length;
        intArrOutput(intArr);
        System.out.println();
        for (int i = 0; i < len; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[--len];
            intArr[len] = temp;
        }
        intArrOutput(intArr);
        System.out.println();
    }

    public static void outputMultiplyArrValues() {
        System.out.println("\n2.Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        int len = multipliers.length;
        for(int i = 0; i < len; i++) {
            multipliers[i] = i;
        }
        int result = 1;
        for(int i = 1; i < len - 1; i++) {
            result *= multipliers[i];
            String outputMultiply = i == (len - 2) ? " = " + result : " * ";
                System.out.print(multipliers[i] + outputMultiply);
        }
        System.out.print("\n" + multipliers[0] + " в масcиве под индексом 0; "
                + multipliers[9] + " в масcиве под индексом 9\n");
    }

    public static void deleteArrValues() {
        System.out.println("\n3.Удаление элементов массива");
        double[] randomDoubles = new double[15];
        System.out.println("\nИсходный массив");
        int len = randomDoubles.length;
        for(int i = 0; i < len; i++) {
            randomDoubles[i] = Math.random();
        }
        randomDoublesOutput(randomDoubles);
        System.out.println("\nИзмененный массив");
        double middleCellValue = randomDoubles[len / 2];
        int zero = 0;
        for(int i = 0; i < len; i++) {
            if(randomDoubles[i] > middleCellValue) {
                randomDoubles[i] = 0;
                zero++;
            }
        }
        randomDoublesOutput(randomDoubles);
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

    public static void generateNumbers() {
        System.out.println("\n5.Генерация уникальных чисел");
        double[] uniqueNumbers = new double[30];
        int len = uniqueNumbers.length;
        long rondomNumbers;
        for(int i = 0; i < len; i++) {
            rondomNumbers = 60 + Math.round(Math.random() * 39);
            for(int j = 0; j < i; j++) {
                if(rondomNumbers == uniqueNumbers[j]) {
                    rondomNumbers = 60 + Math.round(Math.random() * 39);
                    j = -1;
                }
            }
            uniqueNumbers[i] = rondomNumbers;
        }
        sortUniqueNumbers(uniqueNumbers);
        int transfer = len / 3;
        for(int i = 0; i < len; i++) {
            if(transfer == i) {
                transfer = transfer + transfer;
                System.out.println();
            }
            System.out.printf("%5.0f", uniqueNumbers[i]);
        }
        System.out.println();
    }

    public static void copyLines() {
        System.out.println("\n6.Копирование не пустых строк");
        String[] stringArr = new String[]{"    ", "AA", "", "E", "FF", "G", ""};
        int arrLength = 0;
        int len = stringArr.length;
        for(int i = 0; i < len; i++) {
            if(!stringArr[i].isBlank()) {
                arrLength++;
            }
        }
            System.out.println("\n" + Arrays.deepToString(stringArr));
        String[] stringArr1 = new String[arrLength];
        int filledCell = 0;
        int j = 0;
        for(int i = 0; i < arrLength; i++) {
            if(!stringArr[i].isBlank()) {
                filledCell++;
            }
            System.arraycopy(stringArr, filledCell, stringArr1, j, arrLength);
            filledCell = 1;
        }
        System.out.println("\n" + Arrays.deepToString(stringArr1));
        System.out.println();
    }

    static void randomDoublesOutput(double[] randomDoubles) {
        int len = randomDoubles.length;
        for(int i = 0; i < len; i++) {
            if(i % 8 == 0 & i != 0) {
                System.out.println();
            }
            System.out.printf("%8.3f", randomDoubles[i]);
        }
        System.out.println();
    }

    static void intArrOutput(int[] intArr) {
        int len = intArr.length;
        for(int i = 0; i < len; i++) {
            System.out.print(intArr[i] + " ");
        }
    }

    static void sortUniqueNumbers(double[] uniqueNumbers) {
        int len = uniqueNumbers.length;
        for(int i = 0; i < len; i++) {
            double minNumbers = uniqueNumbers[i];
            int min_i = i;
            for(int j = i + 1; j < len; j++) {
                if(uniqueNumbers[j] < minNumbers) {
                    minNumbers = uniqueNumbers[j];
                    min_i = j;
                }
            }
            if(i != min_i) {
                double temp = uniqueNumbers[i];
                uniqueNumbers[i] = uniqueNumbers[min_i];
                uniqueNumbers[min_i] = temp;
            }
        }
    }
}
