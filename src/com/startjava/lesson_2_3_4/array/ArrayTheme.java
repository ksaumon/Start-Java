package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
       rev();
       System.out.println();
       mult();
        System.out.println();
       delete();
    }

        public static void rev() {
            System.out.println("1.Реверс значений массива");
            int[] num = {2, 1, 3, 5, 4, 7, 6};
            for (int num1 : num) {
                System.out.print(num1 + " ");
            }
            System.out.println();
            for (int i = num.length - 1; i >= 0; i--) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }

        public static void mult() {
            System.out.println("2.Вывод произведения элементов массива");
            int sum = 0;
            int[] num = new int[10];
            for (int i = 0; i < num.length ; i++) {
                num[i] += i;
                sum = (i > 0) ? (num[1] * num[2] * num[3] * num[4] * num[5] * num[6] * num[7] * num[8]) : (i = 0);
            }

            System.out.print(num[1] + "*" + num[2] + "*" + num[3] + "*" + num[4] + "*" + num[5]
                    + "*" + num[6] + "*" + num[7] + "*" + num[8] + "=" + sum + "\n");
            System.out.print(num[0] + " в масcиве под индексом 0; " + num[9] + " в масcиве под индексом 9");
            System.out.println();
        }

        public static void delete() {
            System.out.println("3.Удаление элементов массива");
            float[] num = new float[15];
            int middle = num.length / 2;
            for (float i = 0; i < num.length; i++) {
                num[(int) i] = (float) Math.random();
                System.out.print(num[(int) i]+ " ");
                if (middle == i + 1){
                    System.out.println();
                }
            }
            System.out.println();
            for (float num1: num) {
                if (num[middle] == num1){
                    System.out.println();
                }
                if (num1 > num[middle]) {
                    num1 = 0;
                }
                System.out.print(num1 + " ");
            }

        }

}
