import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String word;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите первое число:");
            calculator.setNum(scanner.nextInt());
            System.out.print("Введите знак математической операции:");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число:");
            calculator.setNum1(scanner.nextInt());
            calculator.definitionSign();
            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                word = scanner.nextLine();
            } while(!(word.equals("no")) && !(word.equals("yes")));
        } while(word.equals("yes"));
    }
}