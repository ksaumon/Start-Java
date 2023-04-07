public class  Player {
    private int playerNumber;
    String playerName;

    public Player( String playerName) {
        this.playerName = playerName;
    }

     public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
     }

    public int getPlayerNumber() {
        return playerNumber;
    }
}