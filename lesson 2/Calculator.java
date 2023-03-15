public class Calculator {
    int num;
    int num1;
    char sign;
    int result;
    String vord;
    String vord1;
    String vord2;

    public void act() {
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

    public void choice() {
        do {
            switch (vord) {
                case "yes":
                    break;
                case "no":
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение.");
                    break;
            }
        } while(vord == "yes" || vord == "no");
    }
}
