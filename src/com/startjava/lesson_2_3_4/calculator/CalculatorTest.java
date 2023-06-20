package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        start(calculator, scanner);
        String actionChoice = null;
        do {
            if("yes".equals(actionChoice)) {
                start(calculator, scanner);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            actionChoice = scanner.nextLine();
        } while(!"no".equals(actionChoice));
    }

    static void start(Calculator calculator, Scanner scanner) {
        System.out.print("Введите математическое выражение: ");
        calculator.setExpression(scanner.nextLine());
        calculator.calculate();
    }
}