public class GuessNumber {
    int startRange = 1;
    int endRange = 100;
    Player player1;
    Player player2;
    int unknownNumber;

    public GuessNumber(Player player1, Player player2, int unknownNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.unknownNumber = unknownNumber;
    }

    public void start() {
        if(player1.getPlayerNumber()< startRange || player2.getPlayerNumber() > endRange) {
            System.out.println(player1.getPlayerNumber() + "Число не входит в полуинтервал ( 0 - 100]");
        }
        if(player2.getPlayerNumber() < startRange || player2.getPlayerNumber() > endRange) {
            System.out.println(player2.getPlayerNumber() + "Число не входит в полуинтервал ( 0 - 100]");
        }
        if (player1.getPlayerNumber() == player2.getPlayerNumber()) {
            System.out.println("Вы ввели одинаковые числа, введите разные, победитель только один");
        } else {
            do {
                if(player1.getPlayerNumber() > unknownNumber) {
                    System.out.println("число " + player1.getPlayerNumber() + " больше того, что загадал компьютер.");
                }
                if(player2.getPlayerNumber() > unknownNumber) {
                        System.out.println("число " + player2.getPlayerNumber() + " больше того, что загадал компьютер.");
                }
                if(player1.getPlayerNumber() < unknownNumber) {
                    System.out.println("число " + player1.getPlayerNumber() + " меньше того, что загадал компьютер.");
                }
                if(player2.getPlayerNumber() < unknownNumber) {
                    System.out.println("число " + player2.getPlayerNumber() + " меньше того, что загадал компьютер.");
                }
                break;
            } while((player1.getPlayerNumber() != unknownNumber) && (player2.getPlayerNumber() != unknownNumber));
        }
    }
 }