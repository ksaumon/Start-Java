import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String actionChoice;
        GuessNumber guessNumber = new GuessNumber();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        do {
            System.out.print("Введите имя игрок 1:");
            player1.setPlayerName1(scanner.nextLine());
            System.out.print("Введите имя игрок 2:");
            player2.setPlayerName2(scanner.nextLine());
            guessNumber.setUnknownNumber(rand.nextInt(100) + 1);
            do {
                System.out.print("Введите число игрок 1:");
                player1.setPlayerNumber1(scanner.nextInt());
                guessNumber.start();
                System.out.print("Введите число игрок 2:");
                player2.setPlayerNumber2(scanner.nextInt());
                guessNumber.start();
                scanner.nextLine();
            } while(player1.getPlayerNumber1() != guessNumber.getUnknownNumber()
                    || player2.getPlayerNumber2() != guessNumber.getUnknownNumber());
                System.out.println("число " + guessNumber.getUnknownNumber() + " загадал компьютер. \nВы победили!");
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                actionChoice = scanner.nextLine();
            } while(!actionChoice.equals("no") && !actionChoice.equals("yes"));
        } while(actionChoice.equals("yes"));

    }
}