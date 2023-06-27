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
                    String str = scanner.nextLine();
                    result = Calculator.calculate(str);
                    if(result == -0.1) {
                        System.out.println("Введины некоректные данные");
                    } else {
                        String choiceRecordingForm = result % 1 == 0 ? String.format("%1.0f", result)
                                : String.format("%1.3f", result);
                        System.out.println(choiceRecordingForm);
                    }
                }
            } while(result == -0.1);
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }
}