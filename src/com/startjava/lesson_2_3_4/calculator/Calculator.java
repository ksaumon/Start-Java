package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int num;
    private static int num1;
    private static char sign;

    public static double calculate() {
        String str1 = CalculatorTest.str;
        String[] elements = str1.split(" ");
        num = Integer.parseInt(elements[0]);
        sign = elements[1].charAt(0);
        num1 = Integer.parseInt(elements[2]);
        switch (sign) {
            case '+':
                return Math.addExact(num, num1);
            case '-':
                return Math.subtractExact(num, num1);
            case '*':
                return Math.multiplyExact(num, num1);
            case '/':
                return (double) num / (double) num1;
            case '%':
                return num % num1;
            case '^':
                return Math.pow(num, num1);
        }
        return 0;
    }
}
