public class Calculator {
    public static void main(String[] args) {
         int num = 50;
        int num1 = 5;
        char sign = '+';
        int result = 0;
        long mathematicalExpression = num + num1;
        if(mathematicalExpression == num + num1) {
            sign = '+';
            result = num + num1;
        } else if(mathematicalExpression == num - num1) {
            sign = '-';
            result = num - num1;
        } else if(mathematicalExpression == num * num1) {
            sign = '*';
            result = num * num1;
        } else if(mathematicalExpression == num / num1) {
            sign = '/';
            result = num / num1;
        } else if(mathematicalExpression == num % num1) {
            sign = '%';
            result = num % num1;
        } else if(mathematicalExpression == (num ^ num1 ^ num1)) {
            sign = '^';
            result = 1;
            for (int i = 1; i <= num1; i++) {
                result *= num;
            }
        }
        System.out.println(num + " " + sign + " " + num1 + " = " + result);
    }
}