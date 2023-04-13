import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        int unknownNumber;
        String actionChoice;
        String player;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрок 1:");
        player = scanner.nextLine();
        Player player1 = new Player(player);
        System.out.print("Введите имя игрок 2:");
        player = scanner.nextLine();
        Player player2 = new Player(player);
        do {
            unknownNumber = rand.nextInt(100) + 1;
            GuessNumber guessNumber = new GuessNumber(player1, player2, unknownNumber, scanner);
            guessNumber.start();
            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                actionChoice = scanner.nextLine();
            } while(!actionChoice.equals("no") && !actionChoice.equals("yes"));
        } while(actionChoice.equals("yes"));
    }
}