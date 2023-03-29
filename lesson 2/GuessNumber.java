public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private int unknownNumber;
    Player player = new Player();
    String Player1;
    String Player2;

    {
        Player1 = player.getPlayerName1();
    }

    {
        Player2 = player.getPlayerName2();
    }

    public int getUnknownNumber() {
        return unknownNumber;
    }

    public void setUnknownNumber(int unknownNumber) {
        this.unknownNumber = unknownNumber;
    }

    public void start() {
        if(((player.getPlayerNumber1() < startRange) || (player.getPlayerNumber2() < startRange))
                || ((player.getPlayerNumber1() > endRange) || (player.getPlayerNumber2() > endRange))) {
            System.out.println("Число не входит в полуинтервал ( 0 - 100]");
        } else {
            do {
                if((player.getPlayerNumber1() > unknownNumber) || (player.getPlayerNumber2() > unknownNumber)) {
                    System.out.println("число " + player.getPlayerNumber1() + "" + player.getPlayerNumber2()  + " больше того, что загадал компьютер.");
                    break;
                }
                if((player.getPlayerNumber1() < unknownNumber) || (player.getPlayerNumber2() < unknownNumber)) {
                    System.out.println("число " + player.getPlayerNumber1() + "" + player.getPlayerNumber2() + " меньше того, что загадал компьютер.");
                    break;
                }
            } while((player.getPlayerNumber1() != unknownNumber) || (player.getPlayerNumber2() != unknownNumber));
        }
    }
 }