package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.calculator.Calculator.calculate;
import static com.startjava.lesson_2_3_4.calculator.Calculator.result;

public class CalculatorTest {
    static String str;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actionChoice = "yes";
        do {
            if("yes".equals(actionChoice)) {
                System.out.print("Введите математическое выражение: ");
                str = scanner.nextLine();
                calculate();
                if(result != result % 2) {
                    System.out.println((int) result);
                } else {
                    System.out.printf("%1.3f \n", result);
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            actionChoice = scanner.nextLine();
        } while(!"no".equals(actionChoice));
    }
}