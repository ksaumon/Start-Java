package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static String str;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "yes";
        do {
            if("yes".equals(option)) {
                System.out.print("Введите математическое выражение: ");
                str = scanner.nextLine();
                print();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            option = scanner.nextLine();
        } while(!"no".equals(option));
    }

    static double print() {
        double result = Calculator.calculate();
        if(result % 2 == 0) {
            System.out.println((int) result);
        } else {
            System.out.printf("%1.3f \n", result);
        }
        return result;
    }
}