package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int num;
    private int num1;
    private char sign;
    private double result;

    public void setNum( int num ) {
        this.num = num;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setSign( char sign) {
        this.sign = sign;
    }

     public void calculate() {
        switch (sign) {
            case '+':
                result = addExact(num, num1);
                break;
            case '-':
                result = subtractExact(num, num1);
                break;
            case '*':
                result = multiplyExact(num, num1);
                break;
            case '/':
                result = (double) num / (double) num1;
                break;
            case '%':
                result = num % num1;
                break;
            case '^':
                result = pow(num, num1);
                break;
        }
         if(result != result % 2) {
             System.out.println((int) result);
         } else {
             System.out.printf("%1.3f \n", result);
        }
    }

    public void setExpression(String scanner) {
        String str = String.valueOf(scanner);
        String[] expression = str.split(" ");
        for(int i = 0; i < 3; i++) {
            String str1 = String.valueOf(expression[i]);
            if(i == 0) {
                setNum(Integer.parseInt(expression[i]));
            }
            if(i == 1) {
                setSign(expression[i].charAt(0));
            }
            if(i == 2) {
                setNum1(Integer.parseInt(expression[i]));
            }
        }
    }
}
