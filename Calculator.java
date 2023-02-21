public class Calculator {
    public static void main(String[] args) {
        int num = 50;
        int num1 = 5;
        char div = '/';
        char multi = '*';
        char sum = '+';
        char diff = '-';
        char remainderDivision = '%';
        char degree = '^';
        int result = num + num1;
        int result1 = num - num1;
        int result2 = num * num1;
        int result3 = num / num1;
        long result4 = 1;
        int result5 = num % num1;
        for (int i = 1; i <= num1; i++) {
            result4 *= num;
        }
        long value = result4;
        if (value == result) {
            System.out.println(num + " " + sum + " " + num1 + " = " + result);
        } else if(value == result1) {
            System.out.println(num + " " + diff + " " + num1 + " = " + result1);
        } else if(value == result2) {
            System.out.println(num + " " + multi + " " + num1 + " = " + result2);
        } else if(value == result3) {
            System.out.println(num + " " + div + " " + num1 + " = " + result3);
        } else if(value == result4){
            System.out.println(num + " " + degree + " " + num1 + " = " + result4);
        } else if(value == result5) {
            System.out.println(num + " " + remainderDivision + " " + num1 + " = " + result5);
        }

    }
}