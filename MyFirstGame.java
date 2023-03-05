public class MyFirstGame {
    public static void main(String[] args) {
        int unknownNumber = 100;
        int playerNumber = 15;
        int startRange = 100;
        int endRange = 1;
        if (playerNumber > startRange || playerNumber < endRange
                    || unknownNumber > startRange || unknownNumber < endRange) {
            System.out.println("Число не входит в полуинтервал ( 0 - 100]");
        } else {
            do {
                if(playerNumber > unknownNumber) {
                    System.out.println("число " + playerNumber + " больше того, что загадал компьютер.");
                    playerNumber--;
                } else {
                    playerNumber++;
                }
                if(playerNumber < unknownNumber) {
                    System.out.println("число " + playerNumber + " меньше того, что загадал компьютер.");
                    playerNumber = playerNumber + 2;
                }
            } while (playerNumber != unknownNumber);
            System.out.println("число " + playerNumber + " загадал компьютер. \nВы победили!");
        }
    }
}