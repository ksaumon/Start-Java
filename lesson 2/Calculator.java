public class Calculator {
    private int num;
    private int num1;
    private char sign;
    private int result;

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch (sign) {
            case '+':
                result = num + num1;
                break;
            case '-':
                result = num - num1;
                break;
            case '*':
                result = num * num1;
                break;
            case '/':
                result = num / num1;
                break;
            case '%':
                result = num % num1;
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= num1; i++) {
                    result *= num;
                }
                break;
        }
        System.out.println(result);
    }
}
