package FC_01.bt2;

public class BoarGame extends Game{
    private int minNumOfPlayer;
    private int maxNumOfPlayer;
    private double timeLimit;

    public BoarGame() {
    }

    public BoarGame(String description, int minNumOfPlayer, int maxNumOfPlayer, double timeLimit) {
        super(description);
        this.minNumOfPlayer = minNumOfPlayer;
        this.maxNumOfPlayer = maxNumOfPlayer;
        this.timeLimit = timeLimit;
    }

    public int getMinNumOfPlayer() {
        return minNumOfPlayer;
    }

    public void setMinNumOfPlayer(int minNumOfPlayer) {
        this.minNumOfPlayer = minNumOfPlayer;
    }

    public int getMaxNumOfPlayer() {
        return maxNumOfPlayer;
    }

    public void setMaxNumOfPlayer(int maxNumOfPlayer) {
        this.maxNumOfPlayer = maxNumOfPlayer;
    }

    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return super.toString() +
                "So nguoi choi toi thieu: " + minNumOfPlayer +
                ", So nguoi choi toi da: " + maxNumOfPlayer +
                ", Thoi gian qua han:" + timeLimit;
    }
}
