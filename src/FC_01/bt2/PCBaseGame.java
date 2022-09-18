package FC_01.bt2;

public class PCBaseGame extends Game {
    private double minMegabyte;
    private int numOfMegabyte;
    private double minGHzPerformance;

    public PCBaseGame() {

    }

    public PCBaseGame(String description, double minMegabyte, int numOfMegabyte, double minGHzPerformance) {
        super(description);
        this.minMegabyte = minMegabyte;
        this.numOfMegabyte = numOfMegabyte;
        this.minGHzPerformance = minGHzPerformance;
    }

    public double getMinMegabyte() {
        return minMegabyte;
    }

    public void setMinMegabyte(double minMegabyte) {
        this.minMegabyte = minMegabyte;
    }

    public int getNumOfMegabyte() {
        return numOfMegabyte;
    }

    public void setNumOfMegabyte(int numOfMegabyte) {
        this.numOfMegabyte = numOfMegabyte;
    }

    public double getMinGHzPerformance() {
        return minGHzPerformance;
    }

    public void setMinGHzPerformance(double minGHzPerformance) {
        this.minGHzPerformance = minGHzPerformance;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Megabyte toi thieu can: " + minMegabyte +
                ", So luong megabyte can thiet: " + numOfMegabyte +
                ", Hieu suat: " + minGHzPerformance;
    }
}
