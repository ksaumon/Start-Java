public class  Player {
    private int playerNumber1;
    private int playerNumber2;
    private String playerName1;
    private String playerName2;

    public Player() {}

    public Player(int playerNumber1, int playerNumber2) {
        this.playerNumber1 = playerNumber1;
        this.playerNumber2 = playerNumber2;
    }

    public Player(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    public void setPlayerNumber1(int playerNumber1) {
        this.playerNumber1 = playerNumber1;
    }

    public int getPlayerNumber1() {
        return playerNumber1;
    }

    public void setPlayerNumber2(int playerNumber2) {
        this.playerNumber2 = playerNumber2;
    }

    public int getPlayerNumber2() {
        return playerNumber2;
    }

    public void setPlayerName1(String playerName1) {
        this.playerName1 = playerName1;
    }

    public String getPlayerName1() {
        return playerName1;
    }

    public void setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
    }

    public String getPlayerName2() {
        return playerName2;
    }
}