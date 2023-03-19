public class Calculator {
    private int num;
    private int num1;
    private char sign;
    private int result;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void definitionSign() {
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
