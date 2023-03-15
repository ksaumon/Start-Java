import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner namber = new Scanner(System.in);
        do {
            System.out.print("Введите первое число:");
            calculator.num = namber.nextInt();
            System.out.print("Введите знак математической операции:");
            calculator.sign = namber.next().charAt(0);
            System.out.print("Введите второе число:");
            calculator.num1 = namber.nextInt();
            calculator.act();
            calculator.vord1 = "yes";
            calculator.vord2 = "no";
            Scanner nam = new Scanner(System.in);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                calculator.vord = nam.nextLine();
                calculator.choice();
            } while(!(calculator.vord.equals(calculator.vord2)) && (!(calculator.vord.equals(calculator.vord1))));
        } while(calculator.vord.equals(calculator.vord1));

    }
}