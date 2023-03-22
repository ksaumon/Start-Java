 class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private int unknownNumber;
    private int playerNumber;
    Player playerName1;
    Player playerName2;

    public GuessNumber() {}

    public GuessNumber(Player playerName1, Player playerName2){
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getUnknownNumber() {
        return unknownNumber;
    }

    public void setUnknownNumber(int unknownNumber) {
        this.unknownNumber = unknownNumber;
    }

    public void draw() {
        if(playerNumber < startRange || playerNumber > endRange){
            System.out.println("Число не входит в полуинтервал ( 0 - 100]");
        } else {
            do {
                if(playerNumber > unknownNumber) {
                    System.out.println("число " + playerNumber + " больше того, что загадал компьютер.");
                    break;
                }
                if(playerNumber < unknownNumber) {
                    System.out.println("число " + playerNumber + " меньше того, что загадал компьютер.");
                    break;
                }
            } while(playerNumber != unknownNumber);
        }
    }
 }