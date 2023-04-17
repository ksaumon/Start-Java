import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String option;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрок 1:");
        String name = scanner.nextLine();
        Player player1 = new Player(name);
        System.out.print("Введите имя игрок 2:");
        name = scanner.nextLine();
        Player player2 = new Player(name);
        do {
            GuessNumber guessNumber = new GuessNumber(player1, player2, rand, scanner);
            guessNumber.start();
            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = scanner.nextLine();
            } while(!option.equals("no") && !option.equals("yes"));
        } while(option.equals("yes"));
    }
}