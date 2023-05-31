package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        rev();
        System.out.println();
        mult();
        System.out.println();
        delete();
        System.out.println();
        reverseLadder();
        System.out.println();
        nunbersGeneration();
    }

    public static void rev() {
        System.out.println("1.Реверс значений массива");
        int[] arr= {2, 1, 3, 5, 4, 7, 6};
        for(int num1: arr) {
            System.out.print(num1 + " ");
        }
        System.out.println();
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mult() {
        System.out.println("2.Вывод произведения элементов массива");
        int sum = 0;
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] += i;
            sum = (i > 0) ? (arr[1] * arr[2] * arr[3] * arr[4] * arr[5] * arr[6] * arr[7] * arr[8]) : (i = 0);
        }
        System.out.print(arr[1] + "*" + arr[2] + "*" + arr[3] + "*" + arr[4] + "*" + arr[5]
                + "*" + arr[6] + "*" + arr[7] + "*" + arr[8] + "=" + sum + "\n");
        System.out.print(arr[0] + " в масcиве под индексом 0; " + arr[9] + " в масcиве под индексом 9");
        System.out.println();
    }

    public static void delete() {
        System.out.println("3.Удаление элементов массива");
        double[] arr = new double[15];
        int zero = 0;
        double middle = arr.length / 2;
        double middleCell = 0;
        System.out.println("Исходный массив");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
            if(middle == i - 1) {
                System.out.println();
            }
            if(middle == i ) {
                middleCell = arr[i -1];
            }
            System.out.printf("%8.3f", arr[i]);
        }
        System.out.println("\nИзмененный массив");
        for(double arr1: arr) {
            arr[(int) arr1] = arr1;
            if(middleCell < arr1) {
                arr1 = 0;
                zero++;
            } else {
                arr[(int) arr1] = arr1;
            }
            if(arr[(int) middle + 1] == arr1) {
                System.out.println();
            }
            System.out.printf("%8.3f", arr1);
        }
        System.out.println();
        System.out.println("Количество обнуленных ячеек " + zero);
    }

    public static void reverseLadder() {
        System.out.println("4.Вывод элементов массива лесенкой в обратном порядке");
        int countSymbol = 0;
        char[] arr = new char[26];
        for(char i = 65; i < 91; i++) {
            arr[i - 65] = i;
        }
        for(int i = arr.length - 1; i >= countSymbol; i--) {
            for(int j = 0; j <= countSymbol; j++) {
                if(j <= countSymbol) {
                    System.out.print(arr[(char) i ]);
                    i--;
                }
            }
            System.out.println();
            countSymbol++;
            i = arr.length;
        }
    }

    public static void nunbersGeneration() {
        System.out.println("5.Генерация уникальных чисел");
        double[] arr = new double[30];
        int transfer = arr.length / 3;
        int i,j;
        for(i = 0;i < arr.length; i++) {
            arr[i] = 60 + Math.round (Math.random() * 39);
            for(j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (transfer == i) {
                transfer = transfer + transfer;
                System.out.println();
            }
            System.out.printf("%5.0f", arr[i]);
        }
    }
}
