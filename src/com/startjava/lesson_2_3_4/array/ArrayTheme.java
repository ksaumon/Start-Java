package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
       rev();
       mult();
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
            System.out.println("\n");
        }

        public static void mult() {
            System.out.println("2.Вывод произведения элементов массива");
            int[] num = new int[10];
            for (int i = 0; i < num.length ; i++) {
                num[i] += i;
            }
                int sum = 0;
                sum = num[1] * num[2] * num[3] * num[4] * num[5] * num[6] * num[7] * num[8];
            System.out.print(num[1] + "*" + num[2] + "*" + num[3] + "*" + num[4] + "*" + num[5]
                    + "*" + num[6] + "*" + num[7] + "*" + num[8] + "=" + sum);
        }

}
