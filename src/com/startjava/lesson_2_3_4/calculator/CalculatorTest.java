package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static String str;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "yes";
        do {
            if ("yes".equals(option)) {
                System.out.print("Введите математическое выражение: ");
                str = scanner.nextLine();
                double result = Calculator.calculate();
                if (result % 1 == 0) {
                    System.out.println((int) result);
                } else {
                    System.out.printf("%1.3f \n", result);
                }
//                String choiceRecordingForm = ((result % 1) == 0) ? String.format("%1.0f", result) : String.format("%1.3f", result);
//                System.out.println(choiceRecordingForm);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            option = scanner.nextLine();
        } while (!"no".equals(option));
    }
}