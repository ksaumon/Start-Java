public class Calculator {
    public static void main(String[] args) {
        int num = 50;
        int num1 = 5;
        char mathematicalValue = ('/' | '*' | '+' | '-' | '%' | '^');
        long value = '^';
        if(value == '^') {
            mathematicalValue = '^';
            value = 1;
            for(int i = 1; i <= num1; i++) {
                value *= num;
            }
        } else if(value == '+') {
            mathematicalValue = '+';
            value = num + num1;
        } else if(value == '-') {
            mathematicalValue = '-';
            value = num - num1;
        } else if(value == '*') {
            mathematicalValue = '*';
            value = num * num1;
        } else if(value == '/') {
            mathematicalValue = '/';
            value = num / num1;
        } else if(value == '%') {
            mathematicalValue = '%';
            value = num % num1;
        }
        System.out.println(num + " " + mathematicalValue + " " + num1 + " = " + value);
    }
}