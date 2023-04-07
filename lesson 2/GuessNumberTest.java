import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        int unknownNumber;
        String actionChoice;
        String player;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите имя игрок 1:");
            player = scanner.nextLine();
            Player player1 = new Player(player);
            System.out.print("Введите имя игрок 2:");
            player = scanner.nextLine();
            Player player2 = new Player(player);
            unknownNumber = rand.nextInt(100) + 1;
            do {
                System.out.print("Введите число игрок 1:");
                player1.setPlayerNumber(scanner.nextInt());
                System.out.print("Введите число игрок 2:");
                player2.setPlayerNumber(scanner.nextInt());
                GuessNumber guessNumber = new GuessNumber(player1, player2, unknownNumber);
                guessNumber.start();
                scanner.nextLine();
            } while(player1.getPlayerNumber() != unknownNumber && player2.getPlayerNumber() != unknownNumber);
            if(player2.getPlayerNumber() != unknownNumber) {
                System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " + player1.playerName + "\nВы победили!");
            } else if(player1.getPlayerNumber() != unknownNumber) {
                System.out.println("число " + unknownNumber + " загадал компьютер. Игрок " + player2.playerName + "\nВы победили!");
            }
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                actionChoice = scanner.nextLine();
            } while(!actionChoice.equals("no") && !actionChoice.equals("yes"));
        } while(actionChoice.equals("yes"));
    }
}