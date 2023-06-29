package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int num;
    private static int num1;
    private static char sign;

    public static double calculate(String mathExpression) {
        try {
            validNumbers(mathExpression);
        } catch(NumberFormatException e) {
            System.out.println("Числа должны быть целыми!");
            return -0.1;
        } catch (RuntimeException e) {
            System.out.println("Числа должны быть положительными!");
            return -0.1;
        }
        return switch(sign) {
            case '+' -> Math.addExact(num, num1);
            case '-' -> Math.subtractExact(num, num1);
            case '*' -> Math.multiplyExact(num, num1);
            case '/' -> (double) num / (double) num1;
            case '%' -> num % num1;
            case '^' -> Math.pow(num, num1);
            default -> {yield -0.1;}
        };
    }

    private static void validNumbers(String data) {
        String[] elements = data.split(" ");
        num = Integer.parseInt(elements[0]);
        sign = elements[1].charAt(0);
        num1 = Integer.parseInt(elements[2]);
        if(num < 1 || num1 < 1) {
            throw new RuntimeException("Числа должны быть положительными!");
        }
    }
}
