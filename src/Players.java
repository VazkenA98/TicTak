public class Players {
    private static String firstPlayerName;
    private static String secondPlayerName;
    private int x_Coordinate;
    private int y_Coordinate;
    private char obj;
    private static int firstPlayerSteps = 0;
    private static int secondPlayerSteps = 0;
    private Boolean playerWin = false;

    public Players() {

    }

    public String getFisrtPlayerName() {
        return firstPlayerName;
    }

    public void setFisrtPlayerName(String name) {
        this.firstPlayerName = name;
    }

    public String getSecondPlayerName() {
        return secondPlayerName;
    }

    public void setSecondPlayerName(String secondPlayerName) {
        Players.secondPlayerName = secondPlayerName;
    }

    public Boolean getPlayerWin() {
        return playerWin;
    }

    public void setPlayerWin(Boolean playerwin) {
        this.playerWin = playerwin;
    }

    public int getX() {
        return x_Coordinate;
    }

    public void setX(int x_Coordinate) {
        this.x_Coordinate = x_Coordinate;
    }

    public int getY() {
        return y_Coordinate;
    }

    public void setY(int y_Coordinate) {
        this.y_Coordinate = y_Coordinate;
    }

    public char getObj() {
        return obj;
    }

    public void setObjFirstPlayer(char obj) {
        this.obj = obj;
        firstPlayerSteps++;
    }

    public void setObjSecondPlayer(char obj) {
        this.obj = obj;
        secondPlayerSteps++;
    }

    public static void setFirstPlayerSteps(int firstPlayerSteps) {
        Players.firstPlayerSteps = firstPlayerSteps;
    }

    public static void setSecondPlayerSteps(int secondPlayerSteps) {
        Players.secondPlayerSteps = secondPlayerSteps;
    }

    public int firstPlayerSteps() {
        return firstPlayerSteps;
    }

    public int secondPlayerSteps() {
        return secondPlayerSteps;
    }

}
