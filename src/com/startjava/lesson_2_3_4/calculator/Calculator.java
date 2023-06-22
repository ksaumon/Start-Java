package com.startjava.lesson_2_3_4.calculator;

import static com.startjava.lesson_2_3_4.calculator.CalculatorTest.str;

public class Calculator {
    private static double num;
    private static double num1;
    private static char sign;
    static double result;

    public static double calculate() {
        String str1 = str;
        String[] elements = str1.split(" ");
        Calculator.num = Integer.parseInt(elements[0]);
        Calculator.sign = elements[1].charAt(0);
        Calculator.num1 = Integer.parseInt(elements[2]);
        switch (sign) {
            case '+':
                return Calculator.result = Math.addExact((int) num,(int) num1);
            case '-':
                return Calculator.result = Math.subtractExact((int) num, (int) num1);
            case '*':
                return Calculator.result = Math.multiplyExact((int) num, (int) num1);
            case '/':
                return Calculator.result = num / num1;
            case '%':
                return Calculator.result = num % num1;
            case '^':
                return Calculator.result = Math.pow(num, num1);
        }
        return 0;
    }
}
