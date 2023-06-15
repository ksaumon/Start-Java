package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArrValues();
        outputMultiplyArrValues();
        deleteArrValues();
        reverseLadder();
        generateUniqueNumbers();
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

    public static void generateUniqueNumbers() {
        System.out.println("\n5.Генерация уникальных чисел");
        double[] uniqueNumbers = new double[30];
        int len = uniqueNumbers.length;
        int randomNumbers = (int) (60 + Math.round(Math.random() * 39));;
        for(int i = 0; i < len; i++) {
            random(randomNumbers, i, uniqueNumbers);
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
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNonEmptyStrings = 0;
        int len = srcStrings.length;
        for(int i = 0; i < len; i++) {
            if(!srcStrings[i].isBlank()) {
                countNonEmptyStrings++;
            }
        }
        String[] nonEmptyStrings = new String[countNonEmptyStrings];
        int srcElem = 0;
        int destElem = 0;
        int strCounter = 0;
        for(int i = 0; i < len; i++) {
            if(srcStrings[i].isBlank()) {
                if(strCounter != 0) {
                    srcElem = i - strCounter;
                    System.arraycopy(srcStrings, srcElem, nonEmptyStrings, destElem, strCounter);
                    destElem += strCounter;
                    strCounter = 0;
                }
            } else {
                strCounter++;
                if(i == len - 1) {
                    System.arraycopy(srcStrings, i, nonEmptyStrings, destElem, strCounter);
                }
            }
        }
        copyLinesOutput(srcStrings, nonEmptyStrings);
        System.out.println();
    }

    static void copyLinesOutput(String[] srcStrings, String[] nonEmptyStrings) {
        int len = srcStrings.length;
        for (int i = 0; i < len; i++) {
            System.out.printf("%3.1s", srcStrings[i]);
        }
        System.out.println();
        int len1 = nonEmptyStrings.length;
        for (int i = 0; i < len1; i++) {
            System.out.printf("%3.1s", nonEmptyStrings[i]);
        }
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
            int min = i;
            for(int j = i + 1; j < len; j++) {
                if(uniqueNumbers[j] < minNumbers) {
                    minNumbers = uniqueNumbers[j];
                    min = j;
                }
            }
            if(i != min) {
                double temp = uniqueNumbers[i];
                uniqueNumbers[i] = uniqueNumbers[min];
                uniqueNumbers[min] = temp;
            }
        }
    }

    static void random(int randomNumbers, int i, double[] uniqueNumbers) {
       for(int j = 0; j < i; j++) {
           if(randomNumbers == uniqueNumbers[j]) {
               randomNumbers = (int) (60 + Math.round(Math.random() * 39));
               j = -1;
           }
       }
       uniqueNumbers[i] = randomNumbers;
    }
}
