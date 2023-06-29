package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "yes";
        double result = 0;
        do {
            do {
                if("yes".equals(option)) {
                    System.out.print("Введите математическое выражение: ");
                    String mathExpression = scanner.nextLine();
                    result = Calculator.calculate(mathExpression);
                    if(result == -0.1) {
                        System.out.println("Введены некорректные данные");
                    } else {
                        print(result);
                    }
                }
            } while(result == -0.1);
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    public static void print(double result) {
        System.out.printf((result % 1 == 0) ? "%1.0f%n" : "%1.3f%n", result);
    }
}