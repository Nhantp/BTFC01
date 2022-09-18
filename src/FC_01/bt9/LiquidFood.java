package FC_01.bt9;

public class LiquidFood extends Food{
    private String viscosity;

    public LiquidFood() {
    }

    public LiquidFood(String description, double numOfCalories, String viscosity) {
        super(description, numOfCalories);
        this.viscosity = viscosity;
    }
    @Override
    public double numOfcalo(double numOfCalories) {
        return numOfCalories;
    }

}
