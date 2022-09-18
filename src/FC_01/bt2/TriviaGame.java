package FC_01.bt2;

public class TriviaGame extends Game {
    private double ultimateMoneyPrize;
    private int numberOfQuestion;

    public TriviaGame() {
    }

    public TriviaGame(String description, double ultimateMoneyPrize, int numberOfQuestion) {
        super(description);
        this.ultimateMoneyPrize = ultimateMoneyPrize;
        this.numberOfQuestion = numberOfQuestion;
    }

    public double getUltimateMoneyPrize() {
        return ultimateMoneyPrize;
    }

    public void setUltimateMoneyPrize(double ultimateMoneyPrize) {
        this.ultimateMoneyPrize = ultimateMoneyPrize;
    }

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "So tien nhan duoc: " + ultimateMoneyPrize +
                ", So cau hoi: " + numberOfQuestion;
    }
}
