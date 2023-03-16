import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите первое число:");
            calculator.setNum(scanner.nextInt());
            System.out.print("Введите знак математической операции:");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число:");
            calculator.setNum1(scanner.nextInt());
            calculator.signDefinition();
            calculator.setWord1("yes");
            calculator.setWord2("no");
            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                calculator.setWord(scanner.nextLine());
                do {
                    switch (calculator.getWord()) {
                        case "yes":
                            break;
                        case "no":
                            break;
                        default:
                            System.out.println("Вы ввели недопустимое значение.");
                            break;
                    }
                } while(calculator.getWord() == "yes" || calculator.getWord() == "no");
            } while(!(calculator.getWord().equals(calculator.getWord2())) && (!(calculator.getWord().equals(calculator.getWord1()))));
        } while(calculator.getWord().equals(calculator.getWord1()));
    }
}