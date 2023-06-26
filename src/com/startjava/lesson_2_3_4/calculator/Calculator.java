package com.startjava.lesson_2_3_4.calculator;


public class Calculator {
    private static int num;
    private static int num1;
    private static char sign;

    public static double calculate(String str) {
        String str1 = str;
        try {
            checkingNumber(str1);
        } catch(RuntimeException e) {
            return -0.1;
        }
        double result = switch(sign) {
            case '+' -> Math.addExact(num, num1);
            case '-' -> Math.subtractExact(num, num1);
            case '*' -> Math.multiplyExact(num, num1);
            case '/' -> (double) num / (double) num1;
            case '%' -> num % num1;
            case '^' -> Math.pow(num, num1);
            default -> {yield -0.1;}
        };
        return result;
    }

    public static double checkingNumber( String str1) {
        String[] elements = str1.split(" ");
        double num2 = Double.parseDouble(elements[0]);
        double num3 = Double.parseDouble(elements[2]);
        if(num2 % 1 != 0 || num3 % 1 != 0) {
            throw new RuntimeException();
        }
        num = Integer.parseInt(elements[0]);
        sign = elements[1].charAt(0);
        num1 = Integer.parseInt(elements[2]);
        if(num < 0 || num1 < 0) {
            throw new RuntimeException();
        }
        return num + sign + num1;
    }
}
