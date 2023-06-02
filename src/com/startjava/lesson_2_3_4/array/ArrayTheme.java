package com.startjava.lesson_2_3_4.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTheme {

    public static void main( String[] args) {
//        revArrayValues();
//        outputMultiplyArrValues();
//        deleteArrValues();
//        reverseLadder();
//        nunbersGeneration();
        copyLines();
    }

    public static void revArrayValues() {
        System.out.println("1.Реверс значений массива");
        int[] intArr = {2, 1, 3, 5, 4, 7, 6};
        for(int num: intArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int rev = intArr.length;
        for (int i = 0; i < rev / 2; i++) {
            int temp = intArr[rev - i - 1];
            intArr[rev - i - 1] = intArr[i];
            intArr[i] = temp;
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
    }


    public static void outputMultiplyArrValues() {
        System.out.println("\n2.Вывод произведения элементов массива");
        int multiplyArrValues = 1;
        int[] intArr = new int[10];
        for(int i = 1; i < intArr.length; i++) {
            intArr[i] = i;
            multiplyArrValues *= intArr[i];
            if (i == intArr.length -1) {
                System.out.print(intArr[i]);
            } else {
                System.out.print(intArr[i] + "*");
            }
        }
        System.out.print("=" + multiplyArrValues + "\n");
    }

    public static void deleteArrValues() {
        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArr = new double[15];
        int zero = 0;
        double middle = doubleArr.length / 2;
        double middleCell = 0;
        System.out.println("Исходный массив");
        for(int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
            if(middle == i - 1) {
                System.out.println();
            }
            if(middle == i ) {
                middleCell = doubleArr[i -1];
            }
            arrayOutput(i, doubleArr);
        }
        System.out.println("\nИзмененный массив");
        for( double i: doubleArr) {
            doubleArr[(int) i] = i;
            if(middleCell < i) {
               doubleArr[(int) i] = 0;
                zero++;
            }
            if(doubleArr[(int) middle + 1] == i) {
                System.out.println();
            }
            arrayOutput((int) i, doubleArr);
        }
        System.out.println();
        System.out.println("Количество обнуленных ячеек " + zero + "\n");
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
                    System.out.print(charArr[(char) i ]);
                    i--;
                }
            }
            System.out.println();
            countSymbol++;
            i = charArr.length;
        }
        System.out.println();
    }

    public static void nunbersGeneration() {
        System.out.println("5.Генерация уникальных чисел");
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
        for (i = 0; i < doubleArr.length; i++) {
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
        int arrayLength = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (!stringArr[i].equals("") && !stringArr[i].equals("    ")) {
                arrayLength++;
            }
        }
        System.out.print(arrayLength);
            System.out.println("\n" + Arrays.deepToString(stringArr));
        String[] stringArr1 = new String[arrayLength];
        int filledCell = 0;
        for (int i = 0; i < arrayLength; i++) {
            stringArr1[i] = stringArr[i];
            if (!stringArr[i].equals("") && !stringArr[i].equals("    ")) {
                filledCell++;
                System.arraycopy(stringArr, filledCell, stringArr1, 0, arrayLength);
            }
        }
        //System.out.println("\n" + Arrays.deepToString(stringArr1));
        System.out.println();
    }

    static void arrayOutput(int i, double doubleArr[]) {
        System.out.printf("%8.3f", doubleArr[i]);
    }
}
