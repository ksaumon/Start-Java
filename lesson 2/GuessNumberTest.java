import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String actionChoice;
        GuessNumber guessNumber = new GuessNumber();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите имя игрок 1:");
            Player player1 = new Player(scanner.nextLine());
            System.out.print("Введите имя игрок 2:");
            Player player2 = new Player(scanner.nextLine());
            guessNumber.setUnknownNumber(rand.nextInt(100) + 1);
            do {
                System.out.print("Введите число:");
                guessNumber.setPlayerNumber(scanner.nextInt());
                guessNumber.draw();
                scanner.nextLine();
            } while (guessNumber.getPlayerNumber() != guessNumber.getUnknownNumber());
            System.out.println("число " + guessNumber.getPlayerNumber() + " загадал компьютер. \nВы победили!");
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                actionChoice = scanner.nextLine();
            } while(!(actionChoice.equals("no")) && !(actionChoice.equals("yes")));
        } while(actionChoice.equals("yes"));
    }
}